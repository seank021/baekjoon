from math import factorial

N = int(input())

num = factorial(N)

cnt = 0
while num % 10 == 0:
    num //= 10
    cnt += 1

print(cnt)