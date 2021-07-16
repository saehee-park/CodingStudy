import sys

n = int(sys.stdin.readline())
arr = []
for i in range(n):
    a = list(sys.stdin.readline().split())
    arr.append(a)

ars = []
for i in arr:
    if i[0] == "push":
        ars.append(i[1])
    elif i[0] == "pop":
        if len(ars) == 0:
            print(-1)        
        else:
            deleted = ars.pop(-1)
            print(deleted)
    elif i[0] == "size":
        print(len(ars))
    elif i[0] == 'empty':
        if len(ars) == 0 :
            print(1)
        else:
            print(0)
    elif i[0] == 'top':
        if len(ars) == 0:
            print(-1)
        else:
            print(ars[-1])