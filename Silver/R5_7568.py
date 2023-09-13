import sys
input = sys.stdin.readline

N = int(input())
weight_height = [list(map(int, input().split())) for _ in range(N)]

for i in range(N):
    rank = 1
    for j in range(N):
        if weight_height[i][0] < weight_height[j][0] and weight_height[i][1] < weight_height[j][1]:
            rank += 1
    print(rank, end=' ')
