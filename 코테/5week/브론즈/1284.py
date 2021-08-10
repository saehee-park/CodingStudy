while True:
    N=str(input())
    if N=='0':
        break
    else:
        N=list(map(int,N))
        cnt=1
        for i in N:
            if i==1:
                cnt+=3
            elif i==0:
                cnt+=5
            else:
                cnt+=4
        print(cnt)