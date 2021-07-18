# 그리디 알고리즘 
import sys

n = sys.stdin.readline()
p = list(map(int,sys.stdin.readline().split()))

p.sort()
# print(p)

wait_time = 0
for i in range(len(p)):
    for j in range(i+1):
        wait_time += p[j]

print(wait_time)


# sort한 것이 [1, 2, 3, 3, 4] 일 때
# 1 + (1+2) (1+2+3) (1+2+3+3) (1+2+3+3+4) 이므로 !
