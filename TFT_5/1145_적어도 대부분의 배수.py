num = list(map(int, input().split()))
num.sort()
ans = num[0]

while (1):
    cnt = 0
    for i in num:
        if ans%i == 0:
            cnt += 1   
    if cnt >= 3:
        print(ans)
        break
    ans += 1