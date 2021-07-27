# #1
# N = input()
# new = N
# cnt = 0

# while(True):

#     if int(new) < 10:
#         new = "0"+ new

#     num =  str(int(new[0])+int(new[1]))    
#     new = new[1] + num[-1]
#     cnt += 1

#     if N == new:
#         break
# print(cnt)
# 26만 나옴



#2
# N = int(input())
# cnt = 0

# while(True):
#     a = N//10 # 십의자리 수
#     b = N%10 # 한자리 수
#     num = a+b
#     new = 10*b + (num%10)
#     cnt += 1

#     if N == new:
#         break
# print(cnt)

# 왜,, 다 안되는데,, 짜증나,, 뇌절 올거같아,,, 


#3
N = int(input())
new = N
cnt = 0

while(True):
    a = new//10 # 십의자리 수
    b = new%10 # 한자리 수
    num = a+b
    new = 10*b + (num%10)
    cnt += 1

    if N == new:
        break
print(cnt)