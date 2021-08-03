N = int(input())
List = []

for i in range(N):  
    List.append(input())
ans = list(List[0])

for i in range(N):
    for j in range(len(List[0])):
        if List[i][j] == ans[j]:
            continue
        else:
            ans[j] = "?"

for i in range(len(ans)):
    print(ans[i], end = "")