# # binary search를 안 쓰면 런타임 에러
# class Stack:
#     def __init__(self):
#         self.list =[]
    
#     def push(self,item):
#         self.list.append(item)

#     def pop(self):
#         # 비어 있지 않다면
#         if not self.isEmpty():
#             return self.list.pop(-1)
#         else:
#             return -1

#     def isEmpty(self):
#         return len(self.list)==0

#     def size(self):
#         return len(self.list)

#     def top(self):
#         if not self.isEmpty():
#             return list[len(self.list)]
#         else:
#             return -1

# num1 = int(input())

# stack = Stack()
# for i in range(num1-1):
#     str = input()

#     if str in 'push':
#         push_num = int(str.split(' ')[1])
#         stack.push(push_num)
#     if str in 'top':
#         print(stack.top())
#     if str in 'size':
#         print(stack.size())
#     if str in 'empty':
#         if stack.isEmpty == True:
#             print("1")
#         else:
#             print("0")
#     if str in 'pop':
#         print(stack.pop())

#Binary Search 이용하기
def BinarySearch(arr, val, low, high):
    if low > high:
        return False
    
    mid = (low + high) // 2
    if arr[mid] > val:
        return BinarySearch(arr, val, low, mid - 1)
    elif arr[mid] < val:
        return BinarySearch(arr, val, mid + 1, high)
    else:
        return True



num1 = int(input()) # 숫자
numlist = list(map(int,input().split())) # 리스트
M = int(input()) # 몇 줄
M_list = list(map(int,input().split()))
numlist = sorted(numlist) # 오름차순 정렬하기

for m in M_list :
    if BinarySearch(numlist,m,0,num1-1):
        print(1)
    else:
        print(0)