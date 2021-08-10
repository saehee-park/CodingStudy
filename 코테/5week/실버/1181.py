N=int(input())
x=[]
for _ in range(N):
    y=str(input())
    len_y=len(y)
    x.append((y,len_y))

x_list=list(set(x))
x_list.sort(key=lambda y:(y[1],y[0]))
for y in x:
    print(y[0])


