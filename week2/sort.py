#백준 2750
sort = []
n = int(input())

for i in range (n):
    sort.append(int(input()))

for i in range(len(sort)):
    for j in range(len(sort)):
        if sort[i] < sort [j]:
            sort[i], sort[j] = sort[j], sort[i]

for num in sort:
    print(num)