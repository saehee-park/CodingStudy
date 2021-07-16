import sys

N = int(sys.stdin.readline())

arr = list(map(int, sys.stdin.readline().split()))
sum = 0
for i in arr:
    sum+= i
sum = sum/N
print(sum/max(arr)*100)