X = int(input())
cnt = 0 
line = 0 

while cnt < X:
    line += 1 # 몇번째 대각선인지
    cnt += line # 갯수 카운트

if line%2 == 0:
    x = line + X - cnt # x : 분자
    y = cnt - X + 1    # y : 분모
else:
    x = cnt - X + 1
    y = line + X - cnt

print(str(x) + "/" + str(y))