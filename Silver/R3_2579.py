import sys
input = sys.stdin.readline

numStairs = int(input())
scores = [int(input()) for i in range(numStairs)]

dp = [0] * numStairs
dp[0] = scores[0]
if numStairs > 1:
    dp[1] = scores[0] + scores[1]
if numStairs > 2:
    dp[2] = max(scores[0] + scores[2], scores[1] + scores[2])

for i in range(3, numStairs):
    dp[i] = max(dp[i - 2] + scores[i], dp[i - 3] + scores[i - 1] + scores[i])

print(dp[numStairs - 1])
