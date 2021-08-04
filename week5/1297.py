import math
d,h,w=map(int,input().split())
r=math.sqrt(h**2+w**2)
print(int(d*h/r),int(d*w/r))