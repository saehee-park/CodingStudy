N = int(input())
card = list(map(int, input().split()))
M = int(input())
num = list(map(int, input().split()))
Dict ={}

for i in range(M):
    Dict[num[i]] = 0

for c in card:
    if c in Dict.keys():
        Dict[c] += 1
    else:
        continue

for e in num:
    print(Dict[e], end=' ')