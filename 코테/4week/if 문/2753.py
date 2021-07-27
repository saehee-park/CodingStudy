x=int(input())
if x%4==0:
    if x%100==0 and x%400!=0:
        print(0)
    elif x%100==0 and x%400==0:
        print(1)
    else:
        print(1)
else:
    print(0)