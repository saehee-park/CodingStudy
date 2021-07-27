N, X = map(int, input().split())
A = list(map(int, input().split()))
List = []

for i in A:
    if i < X:
        List.append(i)

for i in List:
    print(i, end=" ")
