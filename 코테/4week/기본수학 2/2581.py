x=int(input())
y=int(input())
ans=[]
for i in range(x,y+1):
    cnt=0
    if i>1:
        for j in range(2,i):
            if i%j==0:
                cnt+=1
                break
        if cnt==0:
            ans.append(i)
if len(ans)>0:                
    print(sum(ans))
    print(min(ans))
else:
    print(-1)