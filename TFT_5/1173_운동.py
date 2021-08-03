N, m, M, T, R = map(int, input().split())
cnt = 0
heart = m

if m+T > M:
    print(-1)
else:
    while(N > 0):
        if heart+T <= M: # 운동 가능
            heart += T
            N -= 1
        else: # 운동 불가능
            if m <= heart-R: # 휴식 가능
                heart -= R
            else: # 맥박 초기 값으로
                heart = m
        cnt += 1
    print(cnt)