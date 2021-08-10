x=str(input())
x=list(map(int,x))
for i in range(len(x)):
    ans1=1
    ans2=1
    for k in x[:i]:
        ans1=ans1*k
    for j in x[i:]:
        ans2=ans2*j
    if ans1==ans2:
        break

if ans1==ans2:
    print("Yes")
else:
    print("No")
