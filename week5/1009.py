n=int(input()) 
for i in range(n):
    a,b=map(int,input().split())
    num=a**b
    re=num%10
    print(re)