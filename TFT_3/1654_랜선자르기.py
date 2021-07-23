K, N = map(int, input().split())
KList = []
ans = 0

for i in range(K):
    KList.append(int(input()))

first = 1
last = max(KList)  # ans를 최대로 길게 해야하므로 List에서 가장 큰 값이 필요

# 이진탐색
while first <= last:
    mid = (first+last) // 2
    cnt = 0

    for i in KList: # List 원소 뽑아서 mid로 나눈 몫 카운트
        cnt += i//mid

    if cnt >= N: # mid가 작아서 cnt가 N보다 너무 커질 수 있음 / cnt가 딱 N개로 안나올 수 있어서 >= 사용
        first = mid+1
        ans = mid

    else: # mid가 커서 cnt가 N이상 X.
        last = mid-1

print(ans)