n = int(input())
call = list(map(int, input().split()))
Y = 0
M = 0

for i in call:
    Y += (i//30+1)*10
    M += (i//60+1)*15

if Y<M:
    print("Y", Y)
elif M<Y:
    print("M", M)
else:
    print("Y M", Y)