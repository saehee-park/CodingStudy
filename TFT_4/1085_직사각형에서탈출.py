x, y, w, h = map(int, input().split())

case1 = abs(x-w)
case2 = abs(y-h)
print(min(case1, case2, x, y))