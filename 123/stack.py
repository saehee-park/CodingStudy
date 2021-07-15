
stack=[]
x=int(input())
for i in range(x):
    y=input()
    p=y.split()
    if p[0]=='psuh':
        stack.append(p[1])

    if p[0]=='pop':
        if len(stack)==0:
            print(-1) 
        else:
            print(stack.pop())
    if p[0]=='size':
        print( len(stack))
    if p[0]=='empty':
        if len(stack)==0:
            print(1) 
        else:
            print(0)
    if p[0]=='top':
        if len(stack)==0:
            print(-1)
        else:
            print(stack[-1])
