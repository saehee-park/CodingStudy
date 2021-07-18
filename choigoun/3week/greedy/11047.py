
# 그리디 알고리즘
import sys

#가장 큰 동전부터 시작해서 몫을 카운트
# 나머지 동전을 내림차순으로 반복한다.

n , k = map(int,sys.stdin.readline().split())
coin = []

for i in range(n):
    coin.append(int(sys.stdin.readline()))

cnt = 0
coin.sort(reverse=True)
for i in coin:
    cnt += k//i #동전으로 나눈 몫을 count
    k = k%i #동전으로 나눈 나머지로 다음 실행

print(cnt)

