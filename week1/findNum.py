n = int(input())
n_li = list(map(int, input().split()))
m = int(input())
m_li = list(map(int, input().split()))
result = list(range(m))

for i in range(m):
    for j in range(n):
        if m_li[i] == n_li[j]:
            result[i] = 1
            break
        else:
            result[i] = 0
            continue

for i in range(m):
    print(result[i])