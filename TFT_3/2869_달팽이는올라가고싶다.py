import sys

A, B, V = map(int, sys.stdin.readline().split())
# ans = 0
# cnt = 0

# while cnt < V:
#     ans += 1
#     cnt += A
#     if cnt < V:
#         cnt -= B    
# print(ans) 
# 시간초과

if (V-B)%(A-B) == 0:
    print(int((V-B)/(A-B)))
else:
    print((V-B)//(A-B)+1)