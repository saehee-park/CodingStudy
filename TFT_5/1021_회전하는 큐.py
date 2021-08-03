N, M = map(int, input().split())
num = list(map(int, input().split()))
Q = []
cnt = 0

for i in range(1,N+1):
    Q.append(i)

for i in range(M):
    if Q[0] == num[i]:
        Q.pop(0)

    else:
        if Q.index(num[i]) <= len(Q)//2:
            for j in range(Q.index(num[i])):
                empt = Q[0]
                Q.pop(0)
                Q.append(empt)
                cnt += 1
            Q.pop(0)
        else:
            for k in range(len(Q) - Q.index(num[i])):
                Q.insert(0,Q[-1])
                Q.pop()
                cnt += 1
            Q.pop(0)  

print(cnt)          