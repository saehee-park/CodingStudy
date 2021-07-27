while True:
    try:
        x=int(input())
        ans=[]
        for i in range(x,(x*2)+1):
            cnt=0
            if i>1:
                for j in range(2,i):
                    if i%j==0:
                        cnt+=1
                        break
                    if cnt==0:
                        ans.append(i)
        print(len(ans))
    except:
        break