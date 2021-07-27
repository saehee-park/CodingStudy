T = int(input())

for i in range(T):
    x1, y1, r1, x2, y2, r2 = map(int, input().split())

    d = ((x2-x1)**2 + (y2-y1)**2)**0.5

    if r1 == r2 and d == 0:
        print(-1)
    elif abs(r2-r1) < d and d < r1+r2:
        print(2)
    elif r1+r2 == d or abs(r2-r1) == d:
        print(1)
    else:
        print(0)