import sys
from collections import Counter
n=int(sys.stdin.readline())
nums=[int(sys.stdin.readline()) for i in range(n)]
nums.sort()

print(round(sum(nums)/n))
print(nums[n//2])
median=Counter(nums).most_common()

if len(nums)>1:
    if median[0][1]==median[1][1]:
        print(median[1][0])
    else:
        print(median[0][0])
else:
    print(median[0][0])

print(max(nums)-min(nums))