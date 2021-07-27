N, M = map(int, input().split()) # N:세로, M:가로
WB = []
ans = []

for i in range(N):
    WB.append(input())

for i in range(N-7):
    for j in range(M-7):
        W_start = 0
        B_start = 0
        for k in range(i, i+8):
            for l in range(j, j+8):
                if (k+l)%2 == 0: # k+l이 홀짝이냐에 따라 W,B를 나눌 수 있음 (대각선)
                    if WB[k][l] != 'W': 
                        W_start += 1
                    if WB[k][l] != 'B':
                        B_start += 1
                else:
                    if WB[k][l] != 'B': 
                        W_start += 1
                    if WB[k][l] != 'W':
                        B_start += 1
        ans.append(W_start)
        ans.append(B_start)

print(min(ans))