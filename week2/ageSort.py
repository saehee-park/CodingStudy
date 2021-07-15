#백준 10814

n =int(input())
li = []

for i in range(n):
    age, name = map(str, input().split())
    age = int(age)
    li.append((age, name))

li.sort(key = lambda member: (member[0]))

for i in range(n):
    print(li[i][0], li[i][1])