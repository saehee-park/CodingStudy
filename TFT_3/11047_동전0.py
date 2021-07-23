N, K = map(int, input().split())
coin = []
ans = 0

for i in range(N):
    coin.append(int(input()))

coin.reverse()

for i in range(0, N):
    if coin[i] <= K:
        ans += K//coin[i]
        K = K%coin[i]
    else:
        continue 
print(ans)