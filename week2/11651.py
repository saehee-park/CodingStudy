N = int(input())
 
nums = [] 
for i in range(N):
    [a, b] = map(int, input().split()) 
    arr = [b, a] nums.append(arr) 
nums = sorted(nums) 

for i in range(N):
    print(nums[i][1], nums[i][0])