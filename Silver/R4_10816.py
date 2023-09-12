import sys
from collections import Counter

input = sys.stdin.readline

N = int(input())
all_cards = list(map(int, input().split()))

M = int(input())
cards = list(map(int, input().split()))

cnt = Counter(all_cards)

for card in cards:
    print(cnt[card], end=' ')
