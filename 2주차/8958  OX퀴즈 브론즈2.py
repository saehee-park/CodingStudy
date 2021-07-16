import sys

N = int(sys.stdin.readline())
arr = []
for i in range(N):
    arr.append(sys.stdin.readline())
    
tot = 0 
a = 0
for i in arr:
    for j in i:
        if j =="O":
            a += 1
            tot += a
        else:
            a = 0
    print(tot)
    tot = 0