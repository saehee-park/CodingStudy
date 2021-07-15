n, m = map(int, input().split())
li = list(map(int, input().split()))
result = 0

for i in range(n):
    for j in range(i+1,n):
        for k in range(j+1,n):
            if li[i]+li[j]+li[k] <= m :
                result = max(result,li[i]+li[j]+li[k])
            else:
                continue

print(result)
