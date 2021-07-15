def addList():
    cd=[]
    x,y=map(int,input().split())
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
                if x[j-1][1]>x[j][1]:
                    x[j-1],x[j]=x[j],x[j-1]
                else:
                    x[j-1],x[j]=x[j-1],x[j]
            j-=1
            
    return x 

n=int(input())
x=makeList(n)
y=listSort(x)
for i in y:
    for j in i:
        print(j,end=" ")
    print()