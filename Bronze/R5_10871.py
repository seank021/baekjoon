firstLine = input()
N = int(firstLine.split(" ")[0])
X = int(firstLine.split(" ")[1])

nums = input()
numsList = []

for i in range(N):
    numsList.append(int(nums.split(" ")[i]))

for num in numsList:
    if (X > num):
        print(num, end=" ")
        