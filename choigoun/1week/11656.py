
# 정렬만 하면됨 문제 덜 풀었음!


import sys

data = sys.stdin.readline()

string_list = []

for i in range(len(data)):
    string_list.append(data[i:len(data)-1])

print(sorted(string_list))

for i in range(len(string_list)):
    print(string_list[i])