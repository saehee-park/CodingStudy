while True:
    x=list(map(int, input().split()))
    x.sort()
    if x[0]==0 and x[1]==0 and x[2]==0:
        break
    if x[2]**2==x[1]**2+x[0]**2:
        print("right")
    else:
        print("wrong")
    