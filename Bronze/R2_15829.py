import sys
input = sys.stdin.readline

alphabets_num_dict = {chr(i+97): i+1 for i in range(26)}

N = int(input())
S = input()

result = 0
for i in range(N):
    result += alphabets_num_dict[S[i]] * (31 ** i)

print(result % 1234567891)