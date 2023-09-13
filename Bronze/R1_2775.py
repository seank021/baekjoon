import sys
input = sys.stdin.readline

testcases = int(input())

for _ in range(testcases):
    floor_k = int(input())
    room_n = int(input())

    floor_0 = [i for i in range(1, room_n+1)]
    for _ in range(floor_k):
        for i in range(1, room_n):
            floor_0[i] += floor_0[i-1]
    print(floor_0[-1])
    