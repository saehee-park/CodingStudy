x = input()
li = [0]*26

for i in x :
    #ord: 문자를 숫자로 바꿔주는 함수 a의 아스키코드 97
    li[ord(i)-97]+=1
for i in li:
    print(i, end=' ')


#2번쨰 버전
x = list(str(input()))
alphabet = ['a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z']
for i in range(len(alphabet)):
    y = x.count(alphabet[i])
    print(y, end=' ')