dct = {}
word = input().upper()
for i in range(len(word)):
    if (dct.get(word[i]) != None):
        dct[word[i]] += 1
    else:
        dct[word[i]] = 1

a = []
for k,v in dct.items():
    if v == max(dct.values()):
        a.append(k)

if (len(a)==1):
    print(a[0])
else:
    print("?")
