import sys

a = int(sys.stdin.readline().rstrip())
for n in range(a):
    b,c = map(int,sys.stdin.readline().split())
    print(b+c)