
import sys
# 1. 첫 번째 input => 각각 n과 k지정
n,k = map(int,sys.stdin.readline().split())

# 2. 두 번째 input => data를 쪼개어 int형태로 모아 list 지정
data_list = list(map(int,sys.stdin.readline().split()))
# 3. list 정렬
data_list.sort()
# 4. 해당 k번째 출력
print(data_list[k-1])