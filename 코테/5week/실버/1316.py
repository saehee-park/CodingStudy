x=int(input())
cnt=0
for _ in range(x):
    y=input()
    list_y=list(map(str,y))
    test_y=list(set(list_y))
    for i in test_y:
        x=[]
        tmp=0
        x.append(y.index(i))
        for k in range(1,len(x)):
            if x[k]-x[k-1]!=1:
                tmp+=1
                break
        if tmp!=0:
            break
        elif tmp==0:
            cnt+=1
            break
print(cnt)