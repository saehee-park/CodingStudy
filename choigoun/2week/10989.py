# 메모리 초과 에러 주의! 개빡세다.. 이 녀석
#  => 미리 list를 0으로 채워둠
#  입력 받을 때마다 해당 숫자의 인덱스를 +1 만큼 증가시키기
#  출력할 때 0이 아니면 해당 인덱스의 숫자값만큼 인덱스+1을 출력하기 

# 즉 list에는 각 입력받은 숫자의 인덱스 안에 횟수가 들어가게됨

import sys

n = int(sys.stdin.readline()) 

check_list = [0] * 10001
for i in range(n): 
    input_num = int(sys.stdin.readline()) 
    check_list[input_num - 1] = check_list[input_num - 1] + 1 

for i in range(10000): 
    if check_list[i] != 0: 
        for j in range(check_list[i]): 
            print(i+1)

