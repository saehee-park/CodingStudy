#백준 13305

num = int(int(input()))
dis_li = list(map(int, input().split()))
cost_li = list(map(int, input().split()))

total = 0
cost=cost_li[0]

for i in range(num-1):
    if cost_li[i]>=cost:
        total += cost*dis_li[i]
    else:
        cost = cost_li[i]
        total += cost*dis_li[i]

print(total)