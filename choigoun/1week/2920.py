data = input() #문자열 입력
data_list = data.split(' ') #문자열을 분해해서 list 생성

a = 0
for i in range(7):
    if abs(int(data_list[i]) - int(data_list[i+1])) == 1 : # ascending & descending 경우
        if int(data_list[i]) == int(data_list[i+1]) + 1: # descending
            a+=1
        if int(data_list[i]) +1 == int(data_list[i+1]) : # ascending
            a-=1
    else:
        break
if a==-7:
    print('ascending')
elif a==7:
    print('descending')
else:    
    print('mixed')