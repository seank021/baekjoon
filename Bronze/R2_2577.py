dct = {}

a = int(input())
b = int(input())
c = int(input())

num = a*b*c

for i in range(len(str(num))):
    if (str(num)[i] in dct):
        dct[str(num)[i]] += 1
    else:
        dct[str(num)[i]] = 1

for i in range(10):
    if (str(i) in dct):
        print(dct[str(i)])
    else:
        print("0")
        