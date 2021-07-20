T = int(input())

for i in range(T):
    H, W, N = map(int, input().split())
    floor = N%H
    if floor == 0:
        floor = H
        num = N//H
    else:
        num = N//H +1

    if num < 10:
        num = "0"+str(num)
    
    print(str(floor)+str(num))