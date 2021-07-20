A,B,C=map(int,input().split())
num=list(range(1,1000000))

cnt=True
for i in range(len(num)):
    if A+B*i<C*i:
        print(i)
        cnt=False
        break
    else:
        cnt=True

if cnt==True:
    print('-1')
