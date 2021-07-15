#백준 10825

n =int(input())
li = []

for i in range(n):
    [name, kor, eng, math] = input().split()
    li.append([name, kor, eng, math])

li.sort(key = lambda a: (-int(a[1]), int(a[2]), -int(a[3]), a[0]))

for i in range(n):
    print(li[i][0])