import sys

M, N = map(int, sys.stdin.readline().split())

for i in range(M,N+1):
    flag = True
    for j in range(2, i):
        if i%j == 0:
            flag = False
            break
        else:
            flag = True
        
    if flag == True:
        print(i)