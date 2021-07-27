H,M=map(int,input().split())
if (0<=H<=24 and 45<=M<=60):
    print(H,M-45)
elif (1<=H<=24 and 0<=M<45):
    print(H-1,60-(45-M))
else:
    print('23',60-(45-M))