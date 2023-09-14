import sys
input = sys.stdin.readline

N = int(input())
nums = [int(input()) for _ in range(N)]

# 1. 산술평균
print(round(sum(nums)/N))

# 2. 중앙값
nums.sort()
print(nums[N//2])

# 3. 최빈값
from collections import Counter
cnt = Counter(nums).most_common()

if len(cnt) > 1:
    if cnt[0][1] == cnt[1][1]:
        print(cnt[1][0])
    else:
        print(cnt[0][0])
else:
    print(cnt[0][0])

# 4. 범위
print(nums[-1] - nums[0])
