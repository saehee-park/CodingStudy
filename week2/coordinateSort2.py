#백준 11651

n =int(input())
li = []
for i in range(n):
    [x,y] = map(int, input().split())
    li.append([y,x])

s_li = sorted(li)

for i in range(n):
    print(s_li[i][1], s_li[i][0])