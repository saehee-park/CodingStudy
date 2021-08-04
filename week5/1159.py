n=int(input())
name=[]
for i in range(n):
    a=input()
    name.append(a[0])

first_name=set(name)
result=[]
for i in first_name:
    if first_name.count(i)>=5:
        result.append(i)

if len(result)>=1:
    print(''.join(sorted(result)))
else:
    print("PREDAJA")