N = int(input())
time = list(map(int, input().split()))
time.sort()
List = []
ans = 0

for i in time:
    ans += i
    List.append(ans)

print(sum(List))