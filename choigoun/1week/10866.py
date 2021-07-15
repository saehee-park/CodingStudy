
# deque 모듈 활용하기 
# 틀렸는데 모르겠다 !!

from collections import deque
import sys

n = int(sys.stdin.readline()) # 명령어 수 n

deque = deque()

def empty(): # 비어있을 때
    if len(deque) == 0: 
        return 1
    else:
        return 0

def size(): # 크기 return 
    return len(deque) 


for i in range(n):
    # 10845랑 비슷
    stack = list(sys.stdin.readline().split())

    if stack[0] == 'push_fromt':
        deque.appendleft(stack[1])
    
    elif stack[0] == 'push_back':
        deque.append(stack[1])
    
    elif stack[0] == 'pop_front': # 비어있는 경우도 처리
        if empty() == 1:
            print('-1')
        else:
            pop_num = deque.popleft()
            print(pop_num)
    
    elif stack[0] == 'pop_back': # 비어있는 경우도 처리
        if empty() == 1:
            print('-1')
        else:
            pop_num = deque.pop()
            print(pop_num)

    elif stack[0] == 'front': # 비어있는 경우도 처리
        if empty() == 1:
            print('-1')
        else:
            print(deque[0])

    elif stack[0] == 'back': # 비어있는 경우도 처리
        if empty() == 1:
            print('-1')
        else:
            print(deque[len(deque)-1])

    elif stack[0] == 'size': 
        print(size())

    elif stack[0] == 'empty': 
        print(empty())
    
    