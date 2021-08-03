n = int(input())
A = list(map(int, input().split()))
B = list(map(int, input().split()))

b = B[:]
a = A[:]

for i in range(n):
    A[b.index(max(b))] = min(a)
    b[b.index(max(b))] = -1
    a[a.index(min(a))] = 101

ans = []
for i in range(n):
    ans.append(A[i]*B[i])
print(sum(ans))