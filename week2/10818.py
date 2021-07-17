import sys
input = sys.stdin.readline
Number= input()

num_list = list(map(int,input().split()))
num_max = num_list[0]
num_min = num_list[0]
for i in num_list:
    if i > num_max:
        num_max = i
    if i < num_min:
        num_min = i
print(num_min, num_max,end='')