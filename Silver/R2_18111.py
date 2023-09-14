# 마인크래프트

import sys
input = sys.stdin.readline
from math import inf

N, M, B = map(int, input().split())
land = []
for _ in range(N):
    land.append(list(map(int, input().split())))

min_time = inf
max_height = 0
for i in land:
    for j in i:
        if j > max_height:
            max_height = j

for height in range(max_height + 1):
    block = B
    time = 0
    for i in land:
        for j in i:
            if j > height:
                block += j - height
                time += 2 * (j - height)
            else:
                block -= height - j
                time += height - j
    if block >= 0:
        if time <= min_time:
            min_time = time
            result = height

print(min_time, result)
