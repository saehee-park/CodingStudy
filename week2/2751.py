import sys
N = int(input())

nums = []

for i in range(N):
    nums.append(int(sys.stdin.readline()))

nums = sorted(nums)

for i in range(N):
    print(nums[i])