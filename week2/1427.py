import sys
num = list(map(str,sys.stdin.readline()))

result = []

for i in num:
    result.append(i)

result.sort()
result.reverse()

print(''.join(result))