N, K = map(int, input().split())

people = [i for i in range(1, N+1)]

print("<", end="")
i = 0
while people:
    i = (i+K-1)%len(people)
    print(people.pop(i), end="")
    if people:
        print(", ", end="")
print(">")
