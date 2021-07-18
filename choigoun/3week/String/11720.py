import sys

n = int(sys.stdin.readline())
data_line = str(sys.stdin.readline())
sum = 0
for i in range(n):
    sum += int(data_line[i])

print(sum)