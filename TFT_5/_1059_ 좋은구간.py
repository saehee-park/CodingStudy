L = int(input())
S = sorted(list(map(int, input().split())))
n = int(input())

if (n in S) or (L == 1) or (n < S[0]):
    print(0)

else: 
    for i in range(L-1):
        if S[i] < n and n < S[i+1]:
            print((n-S[i]-1)*(S[i+1]-n) + S[i+1]-n-1)
            break

# 틀린 이유를 모르겠다,,,