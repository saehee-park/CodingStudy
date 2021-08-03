import sys

A, B = map(str, sys.stdin.readline().split())
ans = 0

for i in range(len(A)):
    for j in range(len(B)):
        ans += int(A[i])*int(B[j])
print(ans)
# pyhton3 : 시간초과


import sys

A, B = map(str, sys.stdin.readline().split())
ListA = list(map(int, A))
ListB = list(map(int, B))
print(sum(ListA)*sum(ListB))
# > (1+2)*(3+4) = 1*3 + 1*4 + 2*3 + 2*4