#2557
# print("Hello World!")

#10718
# print("강한친구 대한육군")
# print("강한친구 대한육군")

#10171
# print("\\    /\\")
# print(" )  ( ')")
# print("(  /  )")
# print(" \(__)|")

#10172
# print("|\\_/|\n|q p|   /}\n( 0 )\"\"\"\\\n|\"^\"`    |\n||_/=\\\\__|")

# #1000
# a,b=map(int, input().split())
# print(a+b)

# #1001
# a,b=map(int, input().split())
# print(a-b)

# #10998
# a,b=map(int, input().split())
# print(a*b)

#1008
# a,b=map(int, input().split())
# print(a/b)

# #10869
# a,b = map(int, input().split())
# print(a+b)
# print(a-b)
# print(a*b)
# print(int(a/b))
# print(a%b)

#10430
# a,b,c = map(int, input().split())
# print((a+b)%c)
# print(((a%c)+(b%c))%c)
# print((a*b)%c)
# print(((a%c)*(b%c))%c)

#2588
# import sys
# n = int(sys.stdin.readline())
#<m = str(sys.stdin.readline())
# for < in reversed(range(3)):
#     print(n*int(m[i]))
# print(n*int(m)==

#2739
# import sys
# n = int(sys.stdin.readline())
# for i in range(1,10,1):
#     print(n,"*",i,"=",n*i)

#10950
# import sys
# L=[]
# n = int(sys.stdin.readline())
# for i in range(n):
#     L.append(list(map(int, input().split())))
# for j in range(n):
#     print(int(L[j][0])+int(L[j][1]))

#8393
# n = int(sys.stdin.readline())
# sum = 0
# for i in range(n+1):
#     sum+=i
# print(sum)

#15552
# import sys
# L=[]
# n = int(sys.stdin.readline())
# for i in range(n):
#     L.append(list(map(int,sys.stdin.readline().split())))
#     print(int(L[i][0]+L[i][1]))

#2741
# import sys
# n = int(sys.stdin.readline())
# for i in range(1,n+1):
#     print(i)

#2742
# import sys
# n = int(sys.stdin.readline())
# for i in range(n,0,-1):
#     print(i)

#11021
# import sys
# n = int(sys.stdin.readline())
# L=[]
# for i in range(n):
#     L.append(list(map(int,sys.stdin.readline().split())))
#     print("Case #{}: {}".format(int(i+1),int(L[i][0]+L[i][1])))

#11022
# import sys
# n = int(sys.stdin.readline())
# L=[]
# for i in range(n):
#     L.append(list(map(int,sys.stdin.readline().split())))
#     print("Case #{}: {} + {} = {}".format(int(i+1),int(L[i][0]),int(L[i][1]),int(L[i][0]+L[i][1])))

#2438
# import sys
# n = int(sys.stdin.readline())
# for i in range(n):
#     print("*"*(i+1))

#2439
# import sys
# n = int(sys.stdin.readline())
# for i in range(1,n+1):
#     print(" "*(n-i),end="")
#     print("*"*i)

#10871
# import sys
# n, m = map(int, sys.stdin.readline().split())
# L = list(map(int, sys.stdin.readline().split()))
# for i in L:
#     if i<m:
#         print(i,end=" ")

#10818
# import sys
# n = int(sys.stdin.readline())
# L = list(map(int, sys.stdin.readline().split()))
# L.sort()
# print(L[0],L[-1])

#2562
# import sys
# L=[]
# for i in range(9):
#     L.append(int(sys.stdin.readline()))
# print(max(L))
# print(L.index(max(L))+1)

#2577
# import sys
# a = int(sys.stdin.readline())
# b = int(sys.stdin.readline())
# c = int(sys.stdin.readline())
# result = list(str(a*b*c))
# for i in range(10):
#     print(result.count(str(i)))

# 3052
# import sys
# L=[]
# for i in range(10):
#     L.append(int(sys.stdin.readline())%42)
# n=set(L)
# print(len(n))

#1546
# import sys
# n=int(sys.stdin.readline())
# score = list(map(int, sys.stdin.readline().split()))
# new_score = 0
# for i in range(n):
#     new_score += score[i]/max(score)*100
# print(new_score/n)

# # 8958 ㅈ같음 (오래걸림 1시간)
# import sys
# n = int(sys.stdin.readline())
# for i in range(n):
#     OX = list(str(sys.stdin.readline()))
#     score = 0
#     straight = 1
#     for j in OX:
#         if j=="O":
#             score+=straight
#             straight+=1
#         else:
#             straight=1
#     print(score)

# 4344 뭘 하라는거야??

#11654
# s=str(input())
# print(ord(s))

# 11720
# import sys
# n = int(sys.stdin.readline())
# m = str(sys.stdin.readline())
# Sum = 0
# for i in range(n):
#     Sum+=int(m[i])
# print(Sum)

# 10809 개어려웠음 한시간 넘게 씀 (C랑 파이썬 아스키코드변환이 어려웠음)
# import sys
# w = sys.stdin.readline()
# abc = list(range(97,123))
# for x in abc :
#     print(w.find(chr(x)),end=" ")

# 2675
# import sys
# n = int(sys.stdin.readline())
# for i in range(n):
#     UQ, QR = map(str,(sys.stdin.readline().split()))
#     UQ.lstrip()
#     QR.lstrip()
#     result = ""
#     for j in range(len(QR)):
#         result = result+(QR[j]*int(UQ))
#     print(result)

# 1157 모르겠음
# import sys
# s = str(sys.stdin.readline())
# s.lstrip()
# L = []
# for i in range(len(s)):
#     L.append(s.count(i))
# print(L)

# 1152
# import sys
# s = list(map(str,sys.stdin.readline().split()))
# print(len(s))

#2908
# import sys
# a,b = map(int, sys.stdin.readline().split())
# Ra, Rb = "",""
# a = str(a)
# b = str(b)
# for i in reversed(range(3)):
#     Ra += a[i]
#     Rb += b[i]
# print(max(Ra, Rb))

# 5622
# import sys
# s = str(sys.stdin.readline())
# n = 0
# dial = ["","ABC","DEF","GHI","JKL","MNO","PQRS","TUV","WXYZ"]#0은 어떻게함?
# for i in range(len(s)):
#     for j in range(len(dial)):
#         if s[i] in dial[j]:
#             n += j+2
# print(n)

# 2941 왜 \n 공백제거가 안됨? ㄱㅃㅊ
# import sys
# a = ['c=', 'c-', 'dz=', 'd-', 'lj', 'nj', 's=', 'z=']
# s = str(sys.stdin.readline())
# for i in a:
#     s = s.replace(i, 'a')
# print(len(s)-1)

# 1316
# import sys
# n = int(input())
# for _ in range(n):
#     word = str(sys.stdin.readline())
#     for i in range(1, len(word)):
#         if word.find(word[i-1]) > word.find(word[i]):
#             n -= 1
#             break
# print(n)

# 1330
# import sys
# n , m = map(int, sys.stdin.readline().split())
# if n>m:
#     print(">")
# elif n<m:
#     print("<")
# else:
#     print("==")

# 9498
# import sys
# score = int(sys.stdin.readline())
# if score>=90:
#     print("A")
# elif score>=80 and score<=89:
#     print("B")
# elif score>=70 and score<=79:
#     print("C")
# elif score>=60 and score<=69:
#     print("D")
# else:
#     print("F")

# 2753
# import sys
# year = int(sys.stdin.readline())
# if (year%4==0 and year%100!=0) or year%400==0:
#     print("1")
# else:
#     print("0")

# 14681
# import sys
# x=int(sys.stdin.readline())
# y=int(sys.stdin.readline())
# if x>0 and y>0:
#     print("1")
# elif x<0 and y>0:
#     print("2")
# elif x<0 and y<0:
#     print("3")
# elif x>0 and y<0:
#     print("4")

# 2884
# import sys
# H,M = map(int,sys.stdin.readline().split())
# if M>44:
#     print(H,M-45)
# elif M<45 and H>0:
#     print(H-1,M+15)
# else:
#     print(23,M+15)

# 10872
# def factorial(x):
#     if x<=1:
#         return 1
#     else:
#         return x*factorial(x-1)
    
# import sys
# n = int(sys.stdin.readline())
# print(factorial(n))

# 10870
# def fibonacci(n):
#     if n<=1:
#         return n
#     return fibonacci(n-1)+fibonacci(n-2)

# import sys
# n=int(sys.stdin.readline())
# print(fibonacci(n))

# 2108 시간초과
# import sys
# from collections import Counter
# n = int(sys.stdin.readline())
# L = []
# for i in range(n):
#     L.append(int(sys.stdin.readline()))
# print(round(sum(L)/n))
# L.sort()
# print(L[n//2])
# cnt_L = Counter(L).most_common()
# if len(cnt_L) > 1 and cnt_L[0][1]==cnt_L[1][1]: #최빈값 2개 이상
#     print(cnt_L[1][0])
# else:
#     print(cnt_L[0][0])
# print(max(L)-min(L))

# 11651
# import sys
# n = int(sys.stdin.readline())
# L = []
# for i in range(n):
#     L.append(list(map(int, sys.stdin.readline().split())))
# L.sort(key=lambda x: (x[1], x[0]))
# for i in L:
#     print(i[0], i[1])

# 1181 어려웠음 인터넷 참고
# import sys
# n = int(sys.stdin.readline())
# L = []
# for i in range(n):
#     word = str(sys.stdin.readline())
#     word_count = len(word)
#     L.append((word, word_count))
# L = list(set(L))
# L.sort(key = lambda word: (word[1], word[0]))
# for word in L:
#     print(word[0],end="")

# 18870 set 함수 빡침
# import sys
# n = int(sys.stdin.readline())
# L = list(map(int, sys.stdin.readline().split()))
# L2 = sorted(list(set(L)))
# dic = {L2[i] : i for i in range(len(L2))}
# for i in L:
#     print(dic[i], end = ' ')

# 10952 뭐 어쩌라고?
# import sys
# while True:
#     try:
#         a, b = map(int, sys.stdin.readline().split())
#     except:
#         break
#     print(a+b)

# 1110
# import sys
# n = num = int(sys.stdin.readline())
# count = 0
# while True:
#     NT = n // 10
#     NO = n % 10
#     number = NT + NO
#     count += 1
#     n = int(str(n % 10) + str(number % 10))
#     if(num == n):
#         break
# print(count)

# 1712
# import sys
# a,b,c = map(int, sys.stdin.readline().split())
# if b>=c:
#     n=-1
# else:
#     n = int(a/(c-b)+1)
# print(n)

# 2292
# import sys
# n = int(sys.stdin.readline())
# cnt = 1
# cnt_six = 6
# count = 1
# while n > cnt:
#     count += 1
#     cnt += cnt_six
#     cnt_six += 6
# print(count)

# 1193 조ㅗㅗㅗㅗㅗㅗㅗㅗㅗㅗ온나 어렵 ㅗㅗㅗㅗ
# import sys
# n = int(sys.stdin.readline())
# line=1
# while n>line:
#     n-=line
#     line+=1  
# if line%2==0:
#     a=n
#     b=line-n+1
# else:
#     a=line-n+1
#     b=n
# print(a, '/', b, sep='')

# 2869
# a, b, v = map(int, input().split())
# day = 0
# if (v - b) % (a - b) != 0:
#     day = ((v - b) // (a - b)) + 1
# else:
#     day = ((v - b) // (a - b))
# print(ls)

