import sys

N = int(sys.stdin.readline())
List = []
Dict = {}

for i in range(N):
    List.append(int(sys.stdin.readline()))
slist = sorted(List)

print(round(sum(List)/N))
print(slist[N//2])

for i in List:
    if i in Dict.keys():
        Dict[i] += 1
    else:
        Dict[i] = 1
  
MaxValue = max(list(Dict.values()))
ans = []
for i in Dict:
    if Dict[i] == MaxValue:
        ans.append(i)

if len(ans) != 1:
    ans.sort()
    print(ans[1])
else:
    print(ans[0])

print(slist[-1]-slist[0])