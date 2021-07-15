
import sys

data = sys.stdin.readline()

# # 1. 문자열 분해해서 list에 넣기
# for i in range(len(data)-1): # 문자열('2143')의 길이 4
#     nums.append(data[i])

# 1. 문자열 분해해서 list에 넣기, list()를 쓰면 자동으로 생성!
nums = list(data)

# 2. 내림차순으로 정렬 reverse = True
nums.sort(reverse=True)

# data = ''
# 3. 다시 문자열로 붙여서 출력하기 -> join으로 다시 해결
# for i in range(len(nums)):
#     data+=nums[i]

print(''.join(nums))


