ms = input()
n = int(input())
girl = []
P = {} # 두 사람이 성공할 확률

for i in range(n):
    girl.append(input())

for i in range(n):
    mg = ms+girl[i]
    L = 0
    O = 0
    V = 0
    E = 0
    for j in range(len(mg)):
        if mg[j] == 'L':
            L += 1
        if mg[j] == 'O':
            O += 1
        if mg[j] == 'V':
            V += 1
        if mg[j] == 'E':
            E += 1
    P[girl[i]] = ((L+O)*(L+V)*(L+E)*(O+V)*(O+E)*(V+E))%100

maxval = max(list(P.values()))
ans = []
for i in P.keys():
    if P[i] == maxval:
        ans.append(i)
ans.sort()
print(ans[0])