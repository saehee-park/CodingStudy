
# 11650의 좌표를 반대로 받아서 정렬한 후 반대로 출력해주기

import sys

n = int(sys.stdin.readline()) # 입력할 점의 개수 
all_data = []
for i in range(n):
    [x,y] = list(map(int,sys.stdin.readline().split()))
    reverse_point = [y,x]

    all_data.append(reverse_point) # 뒤집어서 list에 넣기
sort_all_data = sorted(all_data) # 뒤집은 것을 sorted 해주면 원하는 값 완성

# print(all_data)

for i in range(len(all_data)):
    print(sort_all_data[i][1],sort_all_data[i][0]) # 거꾸로 출력하면 원상태로 출력

