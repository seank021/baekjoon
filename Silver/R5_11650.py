import sys

input = sys.stdin.readline

N = int(input())

coords = [(x,y) for x,y in [map(int, input().split()) for _ in range(N)]]
coords.sort()

for coord in coords:
    print(coord[0], coord[1])