import sys

x,y=map(int,sys.stdin.readline().split())
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
for p in ans:
    print(p)