a,b=map(int,input().split())
li=[]
for i in range(1,b+1):
    for j in range(i):
        li.append(i)
sum=0
for i in range(a-1,b):
    sum+=li[i]
print(sum)
