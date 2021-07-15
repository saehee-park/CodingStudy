def addList(n):
    List=[]
    for i in range(n):
        a=int(input())
        List.append(a)
        
    return List

def listSort(x):
    for i in range(1,len(x)):
        j=i
        while j>0 and x[j-1]>x[j]:
            x[j-1],x[j]=x[j],x[j-1]
            j-=1   
    return x

n=int(input())
x=addList(n)
y=listSort(x)
for i in y:
    print(i)