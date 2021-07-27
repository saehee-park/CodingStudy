n=int(input())
num=list(map(int,input().split()))
recnt=0
for i in num:
    cnt=0
    if i==1:
        continue
    else:
        for j in range(2,i):
            if i%j==0:
                cnt+=1
        if cnt==0:
            recnt+=1

print(recnt)