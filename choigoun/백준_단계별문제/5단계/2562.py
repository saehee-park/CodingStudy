
import sys
data = []
for _ in range(9):
    n = int(sys.stdin.readline())
    data.append(n)
# 최댓값 출력
print(max(data))
# 최댓값이 몇 번째 수인지를 출력
print(data.index(max(data))+1)