x=int(input())
a=0
for i in range(1, x+1):
    b=list(map(int, str(i)))
    a=i+sum(b)
    if a==x:
        print(i)
        break
    if i==x:
        print(0)