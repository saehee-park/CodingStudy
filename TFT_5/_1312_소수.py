A, B, N = map(int, input().split())
C = list(map(str, str(A/B).split(".")))
print(C[1][N-1])

# 런타임 에러 (IndexError)