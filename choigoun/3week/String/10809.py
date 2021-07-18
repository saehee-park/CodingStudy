# 아스키 코드 이용하기 
# find 함수 이용하기 


word = input()
alphabet = list(range(97,123))  # 알파벳의 아스키코드 숫자 범위
# alphabet list에는 97~122까지 입력

# print(alphabet)


for x in alphabet : 
    # 있으면 그 위치를 return 
    # 없으면 -1을 return 
    print(word.find(chr(x))) 