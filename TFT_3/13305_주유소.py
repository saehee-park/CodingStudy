N = int(input())
Len = list(map(int, input().split()))
price = list(map(int, input().split()))
ans = 0

for i in range(N-1):
    if price[i] == min(price[:-2]):
        ans += price[i]*sum(Len[i:])
        break
    else:
        ans += price[i]*Len[i]
print(ans)

#부분성공으로 뜸