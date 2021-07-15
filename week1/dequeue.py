import sys

n = int(sys.stdin.readline())
dq = []

for i in range(n):
    com = sys.stdin.readline().split()
    
    if com[0] == 'push_front':
        dq.insert(0,com[1])

    elif com[0] == 'push_back':
        dq.append(com[1])

    elif com[0] == 'pop_front':
        if len(dq) == 0:
            print(-1)
        else:
            print(dq.pop(0))

    elif com[0] == 'pop_back':
        if len(dq) == 0:
            print(-1)
        else:
            print(dq.pop(-1))

    elif com[0] == 'size':
        print(len(dq))

    elif com[0] == 'empty':
        if len(dq) == 0:
            print(1)
        else:
            print(0)

    elif com[0] == 'front':
        if len(dq) == 0:
            print(-1)
        else:
            print(dq[0])

    elif com[0] == 'back':
        if len(dq) == 0:
            print(-1)
        else:
            print(dq[-1])
