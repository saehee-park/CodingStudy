﻿a = int(input())
for i in range(1,a+1):
    b, c = map(int, input().split())
    print('Case #{}: {} + {} = {}' .format(i,b,c,b+c))
    