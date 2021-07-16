while 1:
    try:
        a = input()
        small = 0
        big = 0
        num = 0
        space = 0
    
        for j in "abcdefghijklmnopqrstuvwxyz":
            small += a.count(j)
        for k in "ABCDEFGHIJKLMNOPQRSTUVWXYZ":
            big += a.count(k)
        for l in "0123456789":
            num += a.count(l)
        space = a.count(" ")
        print(small, big, num, space)
    except:
        break