import sys

A, B, C = map(int, sys.stdin.readline().split())
n = 1

if B >= C:
    print(-1)
else:
    print(int(A/(C-B)+1))