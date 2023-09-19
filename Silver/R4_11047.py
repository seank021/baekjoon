import sys
input = sys.stdin.readline

N, K = map(int, input().split())
coins = list()

for _ in range(N):
    coins.append(int(input()))

coins.sort(reverse=True)

count = 0
for coin in coins:
    if K == 0:
        break
    count += K // coin
    K %= coin

print(count)
