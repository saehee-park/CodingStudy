n=int(input())

chk=True
cnt=0
for i in range(n):
    a=input()
    for i in range(len(a)-1):
        if a[i]!=a[i+1]:
            if a[i] not in a[i+1:]:
                cnt=0
            else:
                cnt+=1
                break
            
print(n-cnt)