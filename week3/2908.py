A=list(map(str,input().split()))

num_list=[]
num=""
for i in A:
    for j in range(len(i)):
        num+=i[len(i)-j-1]

    num_list.append(int(num))
    num=""

print(max(num_list))