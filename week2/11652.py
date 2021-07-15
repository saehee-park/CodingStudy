n=int(input())
List=[]
for i in range(n):
    a=int(input())
    List.append(a)

count={}
for i in List:
    try:
        count[i]+=1
    except:
        count[i]=1

def my_max():
    i=0
    a=count[List[0]]
    num=List[0]
    while i<len(List):
        if a<count[List[i]]:
            a=count[List[i]]
            num=List[i]
        i+=1
    return num

print(my_max())