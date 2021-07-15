def addList():
    cd=[]
    x,y=input().split()
    x=int(x)
    cd.append(x)
    cd.append(y)

    return cd
def makeList(n):
    List=[]
    for i in range(n):
        List.append(addList())
    
    
    return List

def listSort(x):
    for i in range(1,len(x)):
        j=i
        while j>0 and x[j-1][0]>=x[j][0]:
            x[j-1],x[j]=x[j],x[j-1]
            if x[j-1][0]==x[j][0]:
                x[j-1],x[j]=x[j-1],x[j]
            j-=1
            
    return x 

n=int(input())
x=makeList(n)
y=listSort(x)
i=0
while i<len(y):
    print(y[i][0],end=" ")
    print(y[i][1])
    i+=1
print()