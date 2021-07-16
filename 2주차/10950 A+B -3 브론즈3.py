n = int(input())
arr = []
for i in range(n):
    arr.append(list(map(int,input().split())))

for i in range(len(arr)):
    result = 0
    result = arr[i][0]+arr[i][1]
    print(result)