N=int(input())
A=list(map(int,input().split()))
B=list(map(int,input().split()))
A.sort()
testB=B[:]
testB.sort()
testB.reverse()
ans=0
for i in range(N):
    k=B.index(testB[i])
    ans+=A[i]*B[k]

print(ans)