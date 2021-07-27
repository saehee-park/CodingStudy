M=int(input())
N=int(input())
result=[]
for i in range(M,N+1):
    if i!=1:
        cnt=True
        for j in (2,i):
            if i%j==0:
                cnt=False
                break
        if cnt==True:
            result.append(i)

if len(result)==0:
    print('-1')
else:
    print(sum(result))
    print(result[0])