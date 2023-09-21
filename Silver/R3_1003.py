N = int(input())

for _ in range(N):
    fibo_testcase = int(input())

    if fibo_testcase == 0:
        print(1, 0)
    elif fibo_testcase == 1:
        print(0, 1)
    else:
        fibo_list = [0, 1]
        for i in range(2, fibo_testcase + 1):
            fibo_list.append(fibo_list[i - 1] + fibo_list[i - 2])
        print(fibo_list[-2], fibo_list[-1])
    