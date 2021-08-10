L=int(input())
S=list(map(int,input().split()))
n=int(input())
print(S)
n_A=n
n_Alist=[]
n_B=n
n_Blist=[]
while True:
    if (n_A) in S:
        break
    n_Alist.append(n_A)
    n_A-=1
while True:
    if (n_B) in S:
        break

    n_B+=1
    n_Blist.append(n_B)
    

ans=len(n_Alist)*(len(n_Blist)-1)


print(ans)