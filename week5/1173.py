N,m,M,T,R=map(int,input().split())
x=m
ex=0
result=0
if m+T>M:
    print(-1)
else:
    while ex<N:
        if x+T<=M:
            x+=T
            ex+=1
            result+=1
        else:
            x-=R
            if x-R<m:
                x=m
            result+=1
    print(result)