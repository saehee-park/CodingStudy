a,d=map(int,input().split())
b,e=map(int,input().split())
c,f=map(int,input().split())
x=0
y=0
if a==b:
    x=c
elif a==c:
    x=b
elif c==c:
    x=a
if d==e:
    y=f
elif d==f:
    y=e
elif e==f:
    y=d
print(x,y)