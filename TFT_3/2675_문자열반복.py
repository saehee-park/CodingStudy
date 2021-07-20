T = int(input())
ans = ""

for i in range(T):
    R, S = map(str, input().split())
    ans = ""
    for j in S:
        ans += j*int(R)
    print(ans)