#백준 11652
#dictionary 이용하는게 좋음

import sys

dic = {}
n = int(input())

for i in range (n):
    num = int(sys.stdin.readline())
    dic[num] = dic.get(num, 0)+1

s_dic = sorted(dic.items(), key = lambda x:(-x[1],x[0]))

print(s_dic[0][0])