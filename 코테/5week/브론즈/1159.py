x=int(input())
name_list=[]
ans=''
for i in range(x):
    y=input()
    name_list.append(y[0])
    
k=name_list[:]
sk=set(k)
list1=list(sk)
for k in list1:
    cnt=0
    for j in name_list:
        if k==j:
            cnt+=1
    if cnt>=5:
        ans+=k

if len(ans)==0:
    print('PREDAJA')
else:

    print(ans)
    