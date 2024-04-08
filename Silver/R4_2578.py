import sys
input = sys.stdin.readline

input_bingo = [list(map(int, input().split())) for _ in range(5)]
answer_bingo = [list(map(int, input().split())) for _ in range(5)]
match_bingo = [[False] * 5 for _ in range(5)]

cnt = 0

def check_bingo():
    bingo = 0
    for i in range(5):
        if all(match_bingo[i]):
            bingo += 1
        if all(match_bingo[j][i] for j in range(5)):
            bingo += 1
    if all(match_bingo[i][i] for i in range(5)):
        bingo += 1
    if all(match_bingo[i][4 - i] for i in range(5)):
        bingo += 1
    return bingo

for row in answer_bingo:
    for item in row:
        for i in range(5):
            for j in range(5):
                if input_bingo[i][j] == item:
                    cnt += 1
                    match_bingo[i][j] = True
                    if check_bingo() >= 3:
                        print(cnt)
                        exit()

