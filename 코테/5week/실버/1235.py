def test(n):
    n_set=set(n)
    n_list=list(n_set)
    if len(n)==len(n_list):
        return True
    else:
        return False



x=int(input())
list1=[]
for _ in range(x):
    list1.append(str(input()))

qp=len(list1[0])

for i in range(1,qp+1):
    qw=[]
    for k in list1:        
        qw.append(k[-i::])
    if test(qw)==True:
        print(i)
        break
    if i==(qp+1):
        print(qp)
