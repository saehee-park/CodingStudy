x=int(input())
y=list(map(int,input().split()))
y.sort()
print(y[0]*y[-1])