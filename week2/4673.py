def d(n):
    result=0
    for i in list(str(n)):
        result+=int(i)
        
    return result+int(n)

List=[]
for i in range(1,10001):
    a=d(i)
    List.append(a)

for i in range(1,10001):
    if i not in List:
        print(i)
    else:
        pass