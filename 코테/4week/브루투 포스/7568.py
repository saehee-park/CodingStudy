x=int(input())
k=[]

for i in range(x):
    weight,height=map(int,input().split())
    k.append((weight,height))

for j in k:
    rank=1
    for p in k:
        if j[0]<p[0] and i[1] <p[1]:
            rnak+=1
    print(rank, end=" ")