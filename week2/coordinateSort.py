#백준 11650

n =int(input())
li = []
for i in range(n):
    [x,y] = map(int, input().split())
    li.append([x,y])

s_li = sorted(li)

for i in range(n):
    print(s_li[i][0], s_li[i][1])