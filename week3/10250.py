t=int(input())
for i in range(t):
    H,W,N=map(int,input().split())

    floor=N%H
    num=(N//H)+1

    if H>N:
        floor=N
        num=1
    print(int(floor*100+num))
