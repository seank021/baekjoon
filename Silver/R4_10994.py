import sys
input = sys.stdin.readline

n = int(input())
length = 4 * n - 3
stars = [[' '] * length for _ in range(length)]

def draw_stars(n, x, y):
    if n == 1:
        stars[x][y] = '*'
        return
    for i in range(4 * n - 3):
        stars[x][y + i] = '*'
        stars[x + i][y] = '*'
        stars[x + 4 * n - 4][y + i] = '*'
        stars[x + i][y + 4 * n - 4] = '*'
    draw_stars(n - 1, x + 2, y + 2)

draw_stars(n, 0, 0)
for row in stars:
    print(''.join(row))
