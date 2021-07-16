N = int(input())
arr = []
for i in range (N):
    num = int(input())
    if num in arr:
        continue
    else: 
        arr.append(num)

arr.sort()
for i in arr:
    print(i)
