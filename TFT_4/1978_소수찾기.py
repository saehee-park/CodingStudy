N = int(input())
num = list(map(int, input().split()))
ans = []

for i in num:
    flag = True
    if i == 1:
        flag = False
    else:
        for j in range(2, i):
            if i%j == 0:
                flag = False
                break
            else:
                flag = True
    if flag == True:
        ans.append(i)
print(len(ans))