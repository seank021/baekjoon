N = int(input())
target = int(input())

snail = [[0]*N for _ in range(N)]
x, y = (N-1)//2, (N-1)//2
snail[x][y] = 1

dx = [-1, 1, 0, 0]
dy = [0, 0, -1, 1]

i = 2
start = 3

while x != 0 or y != 0:
    while i <= start * start:
        if x == y == (N - 1) // 2:
            cnt_up, cnt_down, cnt_left, cnt_right = start, start - 1, start - 1, start - 2
            x += dx[0]
            y += dy[0]
            cnt_up -= 1

        elif cnt_right > 0: # 우
            x += dx[3]
            y += dy[3]
            cnt_right -= 1

        elif cnt_down > 0: # 하
            x += dx[1]
            y += dy[1]
            cnt_down -= 1

        elif cnt_left > 0: # 좌
            x += dx[2]
            y += dy[2]
            cnt_left -= 1

        elif cnt_up > 0: # 상
            x += dx[0]
            y += dy[0]
            cnt_up -= 1

        snail[x][y] = i
        i += 1

    N -= 2
    start += 2

for j in range(len(snail)):
    print(*snail[j])
    if target in snail[j]:
        mx = j + 1
        my = snail[j].index(target) + 1

print(mx, my)
