#백준 11399

num = int(input())
nums = list(map(int, input().split()))

if num == 1:
    print(nums[0])
else:
    nums.sort()
    total = 0
    for i in range(num):
        total += sum(nums[:i+1])
    print(total)
