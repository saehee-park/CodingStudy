A, B = map(int, input().split())
num = []

for i in range(1,B+1):
    num += [i]*i

print(sum(num[A-1:B]))


# num = ""
# ans = 0

# for i in range(1,B+1):
#     num += str(i)*i

# for i in range(A-1, B):
#     ans += int(num[i])

# print(ans) # 얘는 틀림