import sys

x,y=map(str,sys.stdin.readline().split())
list_x=list(map(int,x))
list_y=list(map(int,y))
print(sum(list_x)*sum(list_y))