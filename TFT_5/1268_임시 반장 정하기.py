n = int(input())
stu = []
Dict = {}
ans = []

for i in range(n):
    stu.append(list(map(int, input().split())))

for i in range(n):
    cnt = []
    List = []
    for j in range(5):
        for k in range(n):
            if stu[i][j] == stu[k][j]:
                cnt.append(k)
    cnt.sort()
    for l in range(len(cnt)):
        if l == len(cnt)-1:
            List.append(cnt[-1])
        else:
            if cnt[l] != cnt[l+1]:
                List.append(cnt[l])
    Dict[i] = len(List)-1

maxvalue = max(list(Dict.values()))

for i in Dict.keys():
    if Dict[i] == maxvalue:
        ans.append(i)
print(min(ans)+1)