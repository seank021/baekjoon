import sys
input = sys.stdin.readline

N, M = map(int, input().split())

site_pw = dict()
for _ in range(N):
    site, pw = input().split()
    site_pw[site] = pw

for _ in range(M):
    print(site_pw[input().rstrip()])
