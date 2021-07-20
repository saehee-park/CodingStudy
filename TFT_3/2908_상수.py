num = list(input().split())
List = []

for i in range(len(num)):
    Rnum = ""
    for j in reversed(range(len(num[i]))):
        Rnum += num[i][j]
    List.append(Rnum)

print(max(List))