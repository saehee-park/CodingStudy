M,N=map(int,input().split())
pac=[]
sol=[]
for i in range(N):
    x,y=map(int, input().split())
    pac.append(x)
    sol.append(y)

a=min(pac)
b=min(sol)
c=M//6
d=M%6
ans=a*c+b*d
if ans>M*b:
    print(M*b)

elif ans>a*(c+1):
    print(a*(c+1))

else:
    print(ans)