n = list(map(int, input().split()))
k = 1
while True:
    cnt=0
    for i in range(5):
        if k%n[i]==0:
            cnt+=1
    if cnt>2:
        print(k)
        break
    k+=1
