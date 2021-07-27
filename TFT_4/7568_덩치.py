N = int(input())
List = []
ans = []

for i in range(N):
    List.append(list(map(int, input().split())))

for i in range(N):
    k = 1
    for j in range(N):
        if List[i][0] < List[j][0] and List[i][1] < List[j][1]:
           k += 1
    ans.append(k)

for i in ans:
    print(i, end=" ")