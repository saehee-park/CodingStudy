N = int(input())
List = []
first = []
Dict ={}
ans = []

for i in range(N):
    List.append(input())

for i in List:
    first.append(i[0])

for i in first:
    if i in Dict.keys():
        Dict[i] += 1
    else:
        Dict[i] = 1

for i in Dict:
    if Dict[i] >= 5:
        ans.append(i)

if len(ans) == 0:
    print("PREDAJA")
else:
    ans.sort()
    for i in range(len(ans)):
        print(ans[i], end = "")