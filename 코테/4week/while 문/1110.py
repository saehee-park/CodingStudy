x=input()
k=x
cnt=0
while True:
    if int(x)<10:
        x=x+x
        cnt+=1
        if k==x:
            break
        
    elif int(x)>10:
        x=x%10+str(((int(x)//10)+(int(x)%10)))
        cnt+=1
        if k==x:
            break