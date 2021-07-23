import sys

N, M = map(int, sys.stdin.readline().split())
tree = list(map(int, sys.stdin.readline().split()))

ans = 0
first = 1
last = max(tree) # 잘리는 나무를 최소화 할려면 길이가 제일 긴 나무로 해야함.

while first <= last:
    mid = (first+last)//2  # mid : 나무 자르는 높이
    cnt = 0

    for i in tree:
        if i-mid >=0: # 이거 안하면 음수 나오는 것도 계산함
            cnt += (i-mid) # cnt : 잘린 나무 길이

    if cnt >= M : # 필요한 길이 충족 + 너무 필요 이상일 수 있으니까 다른데도 봐줌
        ans = mid
        first = mid+1 
        
    else: # 길이 부족
        last = mid-1
        
print(ans)

# python 시간초과 / pypy3 성공