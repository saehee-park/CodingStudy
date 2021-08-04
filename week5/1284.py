while True:
    a=input()
    wide=1+len(a)
    for i in a:
        if i=='1':
            wide+=2
        elif i=='0':
            wide+=4
        else:
            wide+=3
    if a=='0':
        break
    print(wide)