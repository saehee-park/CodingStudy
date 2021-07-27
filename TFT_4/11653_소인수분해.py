N = int(input())

while(N > 1):
    num = 2
    for i in range(N):
        if N%num == 0:
            N = N//num
            print(num)
            break
        else:
            num += 1