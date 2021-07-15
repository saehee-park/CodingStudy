# sort의 parameter인 key=lambda 활용해서
# 정렬할 부분을 지정해주기

import sys

n = int(sys.stdin.readline()) # 입력할 회원의 수
data = []
for i in range(n):
    mem_info = list(sys.stdin.readline().split())
    data.append(mem_info)

# print(data)
data.sort(key=lambda a:int(a[0])) # key와 lambda를 통해 나이만 이용해서 정렬하기

for i in range(len(data)):
    print(data[i][0], data[i][1])