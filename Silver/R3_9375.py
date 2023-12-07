import sys
input = sys.stdin.readline

testcases = int(input())
for _ in range(testcases):
    n = int(input())
    name_kind = {}
    for _ in range(n):
        name, kind = input().split()
        if kind in name_kind:
            name_kind[kind] += 1
        else:
            name_kind[kind] = 1

    answer = 1
    for kind in name_kind:
        answer *= name_kind[kind] + 1
        
    print(answer - 1)
