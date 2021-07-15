def checknum(k):
    check=0
    for i in result:
        if i==k:
            check+=1
        else:
            pass
    return check
        
A=int(input())
B=int(input())
C=int(input())
result=str(A*B*C)
for k in range(10):
    k=str(k)
    print(checknum(k))