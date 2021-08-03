N, M = map(int, input().split())
List = []
n = m = 0

for i in range(N):
    List.append(input())

for i in List:
    if 'X' in i:
        n += 1

for i in range(M):
    for j in range(N):
        if List[j][i] == 'X':
            m += 1
            break
print(max(N-n, M-m))