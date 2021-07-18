# 접근하기 -> 집합의 수 

# 1. Counter를 통해서 종류의 개수 세기
# 2. 각각의 종류를 곱하고 -1  return 

from collections import Counter

def solution(clothes):
    answer = 1
    kind = [] 
    for i, j in clothes:
        kind.append(j)
    
    kind = Counter(kind)
    
    for i in kind.values():
        answer *= (i+1)

    return answer -1


clothes = [["yellowhat", "headgear"], ["bluesunglasses", "eyewear"], ["green_turban", "headgear"]]
print(solution(clothes))