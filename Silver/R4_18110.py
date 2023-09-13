import sys
input = sys.stdin.readline

def round_func(num):
    return int(num) + (1 if num - int(num) >= 0.5 else 0)

N = int(input())
if (N == 0):
    print(0)

else:
    exclude = round_func(N * 0.15)

    scores = [int(input()) for _ in range(N)]
    scores.sort()

    print(round_func(sum(scores[exclude:-exclude] if exclude else scores) / (N - 2 * exclude)))