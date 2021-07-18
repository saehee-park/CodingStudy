# Binary Search 문제이지만.. Counter 사용해서 풂!
from collections import Counter
import sys

# input 받기
n = int(sys.stdin.readline())
data_list = list(map(int,sys.stdin.readline().split()))
m = int(sys.stdin.readline())
find_num = list(map(int,sys.stdin.readline().split()))

count = Counter(data_list)
# Counter({10: 3, 3: 2, -10: 2, 6: 1, 2: 1, 7: 1}) 딕셔너리 형태로 생성!
# print(count)

for i in find_num:
    print(count[i],end=' ')
    #count[key]를 넣어서 value를 return 