#백준 10989

import sys

li = [0]*10001
n = int(input())

for i in range (n):
    num = int(sys.stdin.readline())
    li[num] = li[num]+1

for i in range(len(li)):
    if li[i] !=0:
        for j in range(li[i]):
            print(i)