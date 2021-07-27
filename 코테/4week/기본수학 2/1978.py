x=int(input())
a=list(map(int,input().split()))
ans=0
for i in a:
    cnt=0
    if i>1:
        for j in range(2,i):
            if i%j==0:
                cnt+=1
        if cnt==0:
            ans+=1
                
print(ans)