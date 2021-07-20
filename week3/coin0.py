#백준 11047

num, total = map(int,input().split())

coin = []

for i in range(num):
    coin.append(int(input()))

result = 0

coin.sort(reverse=True)

for i in coin:
    if total == 0:
        break
    result+=total//i
    total%=i

print(result)