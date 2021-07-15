# 런타임 에러


# 아스키 코드 이용
while True:
    data = input() #문자열 입력
    data_list = [] 

    if not data: # 입력받은게 없을 경우 break
        break
    for i in range(len(data)):# 문자열을 분해하여 data_list 생성
        data_list.append(data[i])
    # print(data_list)

    so = 0 # 소문자 개수
    dae = 0 # 대문자 개수
    integer = 0 # 숫자 개수 
    space = 0 # 공백 개수

    for i in range(len(data_list)):
        if ord(data_list[i]) == 32: # 공백일 경우
            space += 1
        elif ord(data_list[i]) >= 65 and ord(data_list[i]) <=90: # 대문자일 경우
            dae += 1
        elif ord(data_list[i]) >= 97 and ord(data_list[i]) <=122: # 소문자일 경우
            so += 1
        elif ord(data_list[i]) >= 48 and ord(data_list[i]) <=57: # 숫자일 경우
            integer += 1

    # print(space)
    # print(dae)
    # print(so)
    # print(integer)

    answer = str(so)+" "+str(dae)+" "+str(integer)+" "+str(space)
    print(answer)