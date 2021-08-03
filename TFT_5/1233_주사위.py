S1, S2, S3 = map(int, input().split())
List = []
Dict = {}
ans = []

for i in range(1,S1+1):
    for j in range(1,S2+1):
        for k in range(1,S3+1):
            List.append(i+j+k)

for i in List:
    if i in Dict.keys():
        Dict[i] += 1
    else:
        Dict[i] = 1

MaxValue = max(list(Dict.values())) 

for i in Dict:
    if Dict[i] == MaxValue:
        ans.append(i)
ans.sort()
print(ans[0])