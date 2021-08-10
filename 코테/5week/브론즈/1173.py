import sys

N,m,M,T,R=map(int,sys.stdin.readline().split())
cnt=0
total=0
now=m
if m+T>M:
    print(-1)
else:
    while cnt<N:
        if now+T<=M:
            now+=T
            cnt+=1
            total+=1
        else:
            now-=R
            if now<m:
                now=m
            total+=1
    print(total)

N, m, M, T, R = map(int, input().split())
now = m
exercise = total = 0

if m + T > M:
    print(-1)
else:
    while exercise < N:
        if now + T <= M:
            now += T
            exercise += 1
            total += 1
        else:
            now -= R
            if now < m:
                now = m
            total += 1
    print(total)