# 백준 11004

n,k = map(int, input().split())

li = list(map(int, input().split()))

s_li = sorted(li)

print(s_li[k-1])