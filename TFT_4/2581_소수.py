M = int(input())
N = int(input())
List = []

for i in range(M,N+1):
    flag = True
    if i == 1:
        flag = False
    else:
        for j in range(2, i):
            if i%j == 0:
                flag = False
                break
            else:
                flag = True
    if flag == True:
        List.append(i)
print(List)
if len(List) == 0:
    print(-1)
else:
    print(sum(List))
    print(List[0])