X = int(input())
start = 64
len = 0
ans = 0

if X == 64:
        print(1)
else:
    while(len != X):
        start = start//2
    
        if len+start <= X:
            len += start
            ans += 1
    print(ans)