import sys

n = 1
for i in range(3):
    n = n * int(sys.stdin.readline())

n = str(n)

for i in range(10):
    print((n.count(str(i))))
