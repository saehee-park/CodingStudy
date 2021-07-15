    cd=[]
    x,y,z,w=input().split()
    y,z,w=int(y),int(z),int(w)
    cd.append(x)
    cd.append(y)
    cd.append(z)
    cd.append(w)

    return cd

def makeList(n):
    List=[]
    for i in range(n):
        List.append(addList())
    
    return List

def listSort(x):
    List=['a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','w','y','z']
    for i in range(1,len(x)):
        j=i
        while j>0:
            if x[j-1][1]<x[j][1]:
                x[j-1],x[j]=x[j],x[j-1]
                
            elif x[j-1][1]==x[j][1]:
                if x[j-1][2]>x[j][2]: 
                    x[j-1],x[j]=x[j],x[j-1]
                    
                if x[j-1][2]<x[j][2]:
                    x[j-1],x[j]=x[j-1],x[j]
                    
                if x[j-1][2]==x[j][2]:
                    
                    if x[j-1][3]>x[j][3]:
                        x[j-1],x[j]=x[j-1],x[j]
                        
                    if x[j-1][3]<x[j][3]:
                        x[j-1],x[j]=x[j],x[j-1]
                        
                    if x[j-1][3]==x[j][3]:
                        a=islow(x[j-1][0])
                        b=islow(x[j][0])
                        for i in List:
                            if i==a[0]:
                                a=int(List.index(i))
                                break
                            if i==b[0]:
                                b=int(List.index(i))
                                break
                                
                            if a>b:
                                x[j-1],x[j]=x[j],x[j-1]
                                
                            else:
                                x[j-1],x[j]=x[j-1],x[j]
                else:
                    x[j-1],x[j]=x[j-1],x[j]
            j-=1
            
    return x 

def islow(s):
    s=s.lower()
    ans=''
    for c in s:
        if c in 'abcdefghijklmnopqrstuvwxyz':
            ans+=c
    return ans
    
n=int(input())
x=makeList(n)
y=listSort(x)
for i in range(len(y)):
    print(y[i][0])