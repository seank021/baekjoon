import sys
input = sys.stdin.readline

M = int(input())
S = set()

def addX(x):
    S.add(x)

def removeX(x):
    if x in S:
        S.remove(x)

def checkX(x):
    if x in S:
        print(1)
    else:
        print(0)

def toggleX(x):
    if x in S:
        S.remove(x)
    else:
        S.add(x)

def all():
    S.clear()
    for i in range(1, 21):
        S.add(i)

def empty():
    S.clear()

for _ in range(M):
    cmd = input().split()
    if cmd[0] == 'add':
        addX(int(cmd[1]))
    elif cmd[0] == 'remove':
        removeX(int(cmd[1]))
    elif cmd[0] == 'check':
        checkX(int(cmd[1]))
    elif cmd[0] == 'toggle':
        toggleX(int(cmd[1]))
    elif cmd[0] == 'all':
        all()
    elif cmd[0] == 'empty':
        empty()
