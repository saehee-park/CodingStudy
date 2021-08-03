N = int(input())
book = []
cnt = []
Dict = {}
ans = []

for i in range(N):
    book.append(input())

for i in book:
    if i in Dict.keys():
        Dict[i] += 1
    else:
        Dict[i] = 1

maxbook = max(list(Dict.values()))

for i in Dict:
    if Dict[i] == maxbook:
        ans.append(i)
ans.sort()
print(ans[0])