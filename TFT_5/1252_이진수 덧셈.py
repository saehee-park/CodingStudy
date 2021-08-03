A, B = map(str, input().split())
A = int(A, 2) # 2진수 > 10진수
B = int(B, 2)

print(bin(A+B)[2:]) #10진수 > 2진수