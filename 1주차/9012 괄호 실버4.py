
n = int(input())

for i in range(n):
    inputword = input()
    result = 0
    for j in inputword:
        if j == "(":
            result+=1
        elif j == ")":
            result -= 1
        if result<0:
            print("NO")
            break
    if result == 0:
        print("YES")
    elif result >0:
        print("NO")
