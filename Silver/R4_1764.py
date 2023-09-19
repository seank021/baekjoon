import sys
input = sys.stdin.readline

N, M = map(int, input().split())

unheard = set()
unseen = set()

for _ in range(N):
    unheard.add(input().rstrip())

for _ in range(M):
    unseen.add(input().rstrip())

unheard_unseen = unheard & unseen
unheard_unseen = sorted(unheard_unseen)

print(len(unheard_unseen))
for person in unheard_unseen:
    print(person)