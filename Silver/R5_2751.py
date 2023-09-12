import sys

input = sys.stdin.readline

N = int(input())
nums = []

for i in range(N):
    nums.append(int(input()))

for num in sorted(nums):
    print(num)
