import sys
input = sys.stdin.readline

N = int(input())
coords = [list(map(int, input().split())) for _ in range(N)]

coords.sort(key=lambda x: (x[1], x[0]))

for coord in coords:
    print(*coord)