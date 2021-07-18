import sys

data = sys.stdin.readline()

alpha_list = ['ABC', 'DEF', 'GHI', 'JKL', 'MNO', 'PQRS', 'TUV', 'WXYZ']

time = 0
for i in range(len(data)): #문자열 요소 하나씩 돌려주기
    for j in range(len(alpha_list)): 
        if data[i] in alpha_list[j]:# 해당 alpha_list에 속하면
            time += (j+3) # 기본이 2초가 걸리므로 alpha_list인덱스(0부터 시작하니까)+3

print(time)