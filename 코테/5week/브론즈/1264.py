k='aeiouAEOIU'
while True:
    x=input()
    if x=='#':
        break
    cnt=0
    for i in x:
        if i in k:
            cnt+=1
    print(cnt)
