# 시간초과
# N1 = int(input())
# M1 = list(map(int,input().split()))

# N2 = int(input())
# M2 = list(map(int,input().split()))

# 여기서 일일히 찾다보면 시간초과 가능 (수가 엄청 많아졌을때)
# for i in M2:
#     if i in M1:
#         print(1)
#     else:
#         print(0)

# 이진탐색  1차시도.(성공)
# N1 = int(input())
# M1 = list(map(int,input().split()))
# M1.sort()

# N2 = int(input())
# M2 = list(map(int,input().split()))
# M2.sort()

# def binary_search(i):
#     if i < M1[0] or i> M1[-1]:
#         print(0)
#     else:
#         if M1[0+len(M1)//2] == i:
#             print(1)
#         elif M1[0+len(M1)//2] < i:
#             if i in M1[:0+len(M1)//2]:
#                 print(1) 
#         else:
#             if i in M1[0+len(M1)//2:]:
#                 print(1)

# for i in M2:
#     binary_search(i)

# 정석적인 이진탙색?
N = int(input())
N_arr = list(map(int,input().split()))
N_arr.sort()

M = int(input())
M_arr = list(map(int,input().split()))

for i in M_arr:
    start = 0
    end = N-1
    target = i
    answer = 0
    while start<= end:
        mid = (end+start)//2
        if N_arr[mid] == target:
            answer = 1
        if N_arr[mid] > target:
            end = mid - 1
        else:
            start = mid+1
    print(answer)