x=int(input())
y=list(map(int, input().split()))
z=int(input())
cnt=0
for i in y:
    if i%z==0:
        cnt+=i//z
    else:
        cnt+=i//z+1


print(z*cnt)
 