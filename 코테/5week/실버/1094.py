X=int(input())
k=[64,32,16,8,4,2,1]
cnt=0
for i in k:
    if X-i>=0:
        X=X-i
        cnt+=1
print(cnt)
