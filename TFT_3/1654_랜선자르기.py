K, N = map(int, input().split())
KList = []

for i in range(K):
    KList.append(int(input()))

first = 1
last = max(KList)

while first <= last:
    mid = (first+last) // 2
    cnt = 0

    for i in KList:
        cnt += i//mid

    if cnt >= N:
        first = mid+1
        ans = mid
    else:
        last = mid-1

print(ans)
