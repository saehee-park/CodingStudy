#백준 3052

li = []
for i in range(10):
    num = int(input())
    li.append(num%42)

#set함수 = 중복 제거 위한 필터 역할
li = set(li)
print(len(li))