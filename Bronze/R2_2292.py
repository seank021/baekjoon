destination = int(input())

nums = 1
cnt = 1

while nums < destination:
    nums += cnt * 6
    cnt += 1

print(cnt)
