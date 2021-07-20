def check(n):
    count={}
    for i in n:
        try:
            count[i]+=1
        except:
            count[i]=1
    return count

result=[]
def num_check(i):
    count_dic=check(card_list)
    if i in count_dic:
        result.append(count_dic[i])
    else:
        result.append(0)
    
    return result

m=int(input())
card_list=list(map(int,input().split()))

n=int(input())
num_list=list(map(int,input().split()))

for i in num_list:
    num_check(i)

A=num_check(i)
for i in A:
    print(i,end=" ")