n=int(input())
for i in range(n):
    num=list(map(int,input().split()))
    avg=sum(num[1:])/num[0]
    cnt=0
    for i in num[1:]:
        if i>avg:
            cnt+=1
            
    result=cnt/(len(num)-1)*100
    
    print(f"{result:.3f}%")