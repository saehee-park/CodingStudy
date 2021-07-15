# 백준 2562

import sys

li = []

for i in range(9):
    num = int(sys.stdin.readline())
    li.append(num)

print(max(li))

for i in range(len(li)):
    if li[i] == max(li):
        print(i+1)

