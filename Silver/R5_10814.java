package Silver;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class R5_10814 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        Student[] arr = new Student[num];
        for (int i = 1; i < num + 1; i++) {
            Student s = new Student(sc.nextInt(), sc.nextLine(), i);
            arr[i - 1] = s;
        }
        Arrays.sort(arr, comparator);

        for (int i = 0; i < num; i++) {
            System.out.println(arr[i].age + arr[i].name);
        }

        sc.close();
    }

    static Comparator<Student> comparator = new Comparator<Student>() {
        @Override
        public int compare(Student s1, Student s2) {
            int result = s1.age - s2.age;
            if (result != 0) {
                return result;
            } else {
                return s1.order - s2.order;
            }
        }
    };
}

class Student {
    int age;
    String name;
    int order;

    Student(int age, String name, int order) {
        this.age = age;
        this.name = name;
        this.order = order;
    }
}
