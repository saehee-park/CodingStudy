n,x=map(int,input().split())
num=list(map(int,input().split()))
result=[]
for i in range(n):
    if num[i]<x:
        result.append(num[i])

for i in result:
    print(i,end=" ")