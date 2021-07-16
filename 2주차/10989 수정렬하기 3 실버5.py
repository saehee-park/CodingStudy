import sys
arr = []
N = int(sys.stdin.readline())
for i in range(N):
    arr.append(sys.stdin.readline())

arr.sort()
for i in arr:
    print(int(i))