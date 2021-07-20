import sys

A=int(sys.stdin.readline())
B=int(sys.stdin.readline())

print(A*(B%10))
print(int(A*(B%100)//10))
print(int(A*(B//100)))
print(A*B)