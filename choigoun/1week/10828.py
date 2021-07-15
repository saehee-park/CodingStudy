# 왜 틀렸는지 모르겠다

import sys


a = int(sys.stdin.readline())

stack = []

for i in range(a):
    str = sys.stdin.readline().split()

    cmd = str.split(' ')[0]

    if cmd =='push':
        push_num = int(str.split(' ')[1])
        stack.append(push_num)

    if cmd == 'pop':
        if not stack:
            print(-1)
        else:
            print(stack[-1])
            stack.pop()


    if cmd == 'top':
        if not stack:
            print(-1)
        else:
            print(stack[-1])

    if cmd == 'size':
        print(len(stack))

    if cmd == 'empty':
        if not stack:
            print(1)
        else:
            print(0)