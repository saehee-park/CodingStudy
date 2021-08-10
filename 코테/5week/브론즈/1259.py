while True:
    x=input()
    if x=='0':
        break
    if x[::-1]==x:
        print('yes')
    else:
        print('no')
