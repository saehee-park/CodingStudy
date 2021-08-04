n,l=map(int,input().split())
cnt=1
while n>0:
    cnt+=1
    if str(l) in str(cnt):
        pass
    else:
        n-=1
print(cnt)