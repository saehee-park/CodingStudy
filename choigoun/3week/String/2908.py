
import sys

a,b = list(map(str,sys.stdin.readline().split()))

#문자열 뒤집기

# 방법 1. print(''.join(reversed(string))) 

# 꿀팁!!!
# 방법 2. string([::-1])을 사용하면 문자열을 뒤집어준다.
# 주의 -> input 또한 int아닌 str로 받아줘야함.(TypeError)
a = int(a[::-1])
b = int(b[::-1])

print(max(a,b))
