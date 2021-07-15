#stack 이용한 () 문제
import sys


def check(string):

    stack = []
    for i in string:
        if len(stack) == 0 and i ==')':
            return 'NO'
        if i == '(':
            stack.append(i)
        elif stack[-1]=='(':
            stack.pop()
        else:
            return 'NO'
    if len(stack)==0:
        return 'YES'
    return 'NO'



input = sys.stdin.readline
n = int(input().strip())
for i in range(n):
    string = input().strip()
    print(check(string))