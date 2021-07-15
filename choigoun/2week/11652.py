# 딕셔너리 이용하기 
import sys

n = int(sys.stdin.readline()) 
dic = {}

for i in range(n): 
    m = int(sys.stdin.readline())
    if m in dic:
        dic[m] +=1 # 값이 있을 경우 숫자값만 +1
    else:
        dic[m] = 1 # dic에 m:1 이라는 값 추가 
        # list로 치면 append 하는 과정

# print(dic)
# 딕셔너리의 경우 sort()를 제공하지 않는다(사용할 수 없다!)
# 그래서 sorted의 parameter 안에 dic를 넣고 변수에 저장해줘야 한다.

sort_dict = sorted(dic.items(), key=lambda x:(-x[1],x[0]))
print(sort_dict[0][0]) #dic의 정렬된 0번째 key 반환

# 주의할 점 !! -> x:(-x[1],x[0])
# x:안에 있는 순서가 중요하다. 
# x:(x[0],-x[1]) 할 경우 틀림!
