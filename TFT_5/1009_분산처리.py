import sys

N = int(sys.stdin.readline())
List = [[0,0,0,0], [1,1,1,1], [2,4,8,6], [3,9,7,1], [4,6,4,6], [5,5,5,5], [6,6,6,6], [7,9,3,1], [8,4,2,6], [9,1,9,1]]

for i in range(N):
    a, b = map(int, sys.stdin.readline().split())
    if a%10 == 0:
        print(10)
    else:
        print(List[a%10][b%4-1])

#     if (a**b)%10 == 0:
#         print(10)
#     else:
#         print((a**b)%10)
# 시간 초과