# 수 정렬하기
# n = int(input())
# L = []
# for i in range(n):
#     L.append(int(input()))
# L.sort()
# for i in L:
#     print(i)

#소트인사이드
# num = input()
# L=[]
# new_num = ""
# for i in range(len(num)):
#    L.append(num[i])
# L.sort(reverse=True)
# for i in L:
#    new_num += i

# 좌표 정렬
# import sys
# n = int(sys.stdin.readline())
# L = []
# for i in range(n):
#     L.append(list(map(int, sys.stdin.readline().split())))
# L.sort(key=lambda x: (x[0], x[1]))
# for i in L:
#     print(i[0], i[1])

# 나이순 정렬
# import sys
# n=int(sys.stdin.readline())
# human = []
# for i in range(n):
#     human.append(list(sys.stdin.readline().split()))
# human.sort(key=lambda x: int(x[0]))
# for i in range(n):
    # print(human[i][0], human[i][1])

#국영수
# import sys 
# n = int(sys.stdin.readline())
# a = []
# for i in range(n):
#     [name, kor, eng, math] = sys.stdin.readline().split()
#     a.append([name, kor, eng, math])
# b = sorted(a, key= lambda a: (-int(a[1]), int(a[2]), -int(a[3]), a[0]))
# for i in range(n):
#     print(b[i][0])

#수정렬3
# import sys
# num = int(sys.stdin.readline())

# arr = [0] * 10001 
# for i in range(num):
#     arr[int(sys.stdin.readline())] += 1
# for i in range(10001):
#     for j in range(arr[i]):
#         sys.stdout.write(str(i) + '\n')



#카드
# import sys
# n = int(sys.stdin.readline())
# d = []
# for i in range(n):
#     d.append(int(sys.stdin.readline()))

# ct = list(set(d))

# lst = []
# for i in range(len(ct)):
#     lst.append([d.count(ct[i]), ct[i]])
# lst.sort(key= lambda x: (x[0], -x[1]), reverse=True)

# print(lst[0][1])

#k번쨰수
n, k=map(int, input().split())
arr = list(map(int, input().split()))
arr = sorted(arr)
print(arr[k-1])

