N = int(input())
arr = []
for i in range (N):
    a, b = input().split()
    a = int(a)
    arr.append([a,b])

#lamda 복습
arr.sort(key=lambda x: int(x[0]))
for i in range(N):
    print(arr[i][0],arr[i][1])