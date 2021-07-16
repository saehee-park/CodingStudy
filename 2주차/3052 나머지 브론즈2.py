import sys

arr = []
for i in range(10):
    input = (int(sys.stdin.readline())%42)
    if input not in arr:
        arr.append(input)

print(len(arr))