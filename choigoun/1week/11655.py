
# 요약 : 아스키 코드 활용하기
# 알파벳을 13자리 밀고 해당하는 아스키 코드가 알파벳이
# 아닐경우 알파벳으로 만들어줘야함(-26)

data = input() #문자열 입력
data_list = [] 

for i in range(len(data)):# 문자열을 분해하여 data_list 생성
    data_list.append(data[i])
# print(data_list)

for i in range(len(data)):
    if ord(data_list[i]) >= 65 and ord(data_list[i]) <=90: #영어 대문자일 경우
        if ord(data_list[i]) + 13 <= 90:
            data_list[i] = chr(ord(data_list[i]) + 13)
        else:
            data_list[i] = chr(ord(data_list[i]) + 13 - 26)
    elif ord(data_list[i]) >= 97 and ord(data_list[i]) <=122:# 소문자일 경우
        if ord(data_list[i]) + 13 <= 122:
            data_list[i] = chr(ord(data_list[i]) + 13)
        else:
            data_list[i] = chr(ord(data_list[i]) + 13 - 26)
# print(data_list)
answer = ''
for i in data_list:
    answer = answer + i

print(answer)