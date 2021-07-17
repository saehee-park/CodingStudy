# 문제
# 정수 n개가 주어졌을 때, n개의 합을 구하는 함수를 작성하시오.

# a: 합을 구해야 하는 정수 n개가 저장되어 있는 리스트 (0 ≤ a[i] ≤ 1,000,000, 1 ≤ n ≤ 3,000,000)
# 리턴값: a에 포함되어 있는 정수 n개의 합 (정수)


def solve(a):
    ans = 0
    for i in range(len(a)):
        ans += a[i]
    return ans

a = []
n = int(input())

for i in range(n):
    a.append(int(input()))

print(solve(a))
#런타임 에러