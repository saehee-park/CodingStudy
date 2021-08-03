N, S, P = map(int, input().split()) # S: 새로운 점수

if N == 0: # 리스트 비어있을 때
    print(1) 

else:
    ListP = list(map(int, input().split()))
    if N==P and ListP[-1] >= S:
        print(-1)
    else:
        for i in range(N):
            if ListP[i] <= S:
                print(i+1)
                break

# 뭐가 틀렸을까...?