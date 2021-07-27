x,y,w,h=map(int,input().split())
a=w-x
b=h-y
ans=[x,y,a,b]
print(min(ans))