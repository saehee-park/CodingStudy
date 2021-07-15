
# sort의 parameter인 key=lambda 활용해서
# 정렬할 부분을 지정해주기
# 내림차순을 위해서는 -를 앞에 붙여줌으로써 해결할 수 있다.

import sys

n = int(sys.stdin.readline()) # 입력할 회원의 수
data = []
for i in range(n):
    score_info = list(sys.stdin.readline().split())
    data.append(score_info)

# print(data)
data.sort(key=lambda a:(-int(a[1]),int(a[2]),-int(a[3]),a[0])) # 내림차순을 위해서는 -를 앞에 붙여줌으로써 해결할 수 있다.

for i in range(len(data)):
    print(data[i][0])