nums = input()
a = nums.split(" ")[0]
b = nums.split(" ")[1]

aRev = a[-1::-1]
bRev = b[-1::-1]

if (int(aRev) > int(bRev)):
    print(aRev)
else:
    print(bRev)
    