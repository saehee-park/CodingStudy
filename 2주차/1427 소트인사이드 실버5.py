# 문자열 chr을 list(chr)을 해주면 한글자씩 리스트에 담긴다.
# num = 1234
# print(list(num))

input_num = input()
sort = sorted(list(input_num), reverse=True)
result = int("".join(sort))
print(result)
