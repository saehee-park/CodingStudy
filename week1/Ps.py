n =int(input())

for i in range(n):
    s_li = list(map(int, input().split()))
    sum = 0
    for i in s_li:
        if i == '(':
            sum+=1
        elif i ==')':
            sum-=1
        elif sum < 0:
            print('NO')
            
    if sum == 0:
        print('YES')
    else:
        print('NO')

