
# 뭐지? 2750이랑 코드 똑같이 돌렸는데 맞았다
import sys

n = int(sys.stdin.readline()) # 수의 개수 

nums = []

for _ in range(n):
    nums.append(int(sys.stdin.readline()))

# print("정렬 전",nums)
nums.sort()
# print("정렬 후",nums)
for i in range(n):
    print(nums[i])
