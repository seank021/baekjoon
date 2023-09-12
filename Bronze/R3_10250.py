num = int(input())
for i in range(num):
    info = input()
    H = int(info.split()[0])
    W = int(info.split()[1])
    N = int(info.split()[2])

    floor = N%H
    room = (N//H) + 1
    if (floor == 0):
        floor = H
        room -= 1
    
    print(floor*100 + room)
