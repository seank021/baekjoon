data = input()

stack = []
ans = ''
isParen = False

for d in data:
    if d == '<':
        isParen = True
        for _ in range(len(stack)):
            ans += stack.pop()
    stack.append(d)
    if d == '>':
        isParen = False
        for _ in range(len(stack)):
            ans += stack.pop(0)
    if d == ' ' and isParen == False:
        for i in range(len(stack)):
            if i == 0:
                stack.pop()
                continue
            ans += stack.pop()
        ans += ' '
        
if stack:
    for _ in range(len(stack)):
        ans += stack.pop()

print(ans)
