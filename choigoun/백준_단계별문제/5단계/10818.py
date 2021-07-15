
import sys

n = int(sys.stdin.readline())

data_list = list(map(int,sys.stdin.readline().split()))

print(min(data_list),max(data_list))