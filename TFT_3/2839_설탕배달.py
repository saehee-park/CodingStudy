N = int(input())
ans = 0

while True:
    if N%5 == 0:
        print(ans + N//5)
        break
    else:
        N -= 3
        ans += 1

    if N < 0:
        print(-1)
        break