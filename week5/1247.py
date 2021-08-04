import sys
ans=[]
for j in range(3):
    n=int(sys.stdin.readline())
    for i in range(n):
        a=int(sys.stdin.readline())
        sum+=a
    if a>0:
        ans.append('+')
    elif a<0:
        ans.append('-')
    else:
        ans.append('0')

for i in ans:
    print(i)
