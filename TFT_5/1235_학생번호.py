N =  int(input())
num = []
k = 1

for i in range(N):
    num.append(input())

for i in range(1, len(num[0])+1):
    List = []
    for j in range(N):
        if num[j][-i:] not in List:
            List.append(num[j][-i:])

    if len(List) == N:
        print(k)
        break
    else:
        k += 1