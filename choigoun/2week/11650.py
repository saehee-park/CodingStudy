

import sys

n = int(sys.stdin.readline()) # 입력할 점의 개수 
all_data = []
for i in range(n):
    data_list = list(map(int,sys.stdin.readline().split()))
    all_data.append(data_list)


all_data.sort()
# print("정렬한 ",all_data) # sort를 통해서 해결가능

# 출력하기
for i in all_data:
    print(i[0],i[1])