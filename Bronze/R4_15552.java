package Bronze;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class R4_15552 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
        int num = Integer.parseInt(reader.readLine());
        for (int i = 0; i < num; i++) {
            String[] arr = reader.readLine().split(" ");
            int sum = Integer.parseInt(arr[0]) + Integer.parseInt(arr[1]);
            writer.write(sum + "\n");
        }
        reader.close();
        writer.flush();
        writer.close();
    }
}
