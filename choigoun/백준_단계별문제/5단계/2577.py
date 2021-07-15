
import sys
data = 1
count_list = [0]*10
for _ in range(3):
    n = int(sys.stdin.readline())
    data*=n

# print(data)
# str(data)
for i in str(data):
    count_list[int(i)]+=1

for k in range(10):
    print(count_list[k])
