a=input()
result=0
apt=['a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z']
for i in range(len(apt)):
    if apt[i] in a:
        result=a.find(apt[i])
    else:
        result=-1
    print(result,end="")