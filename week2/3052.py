def remainder(i):
    result=i%42
    return result

def checknum(resultList):
    new_list=[]
    for i in resultList:
        if i not in new_list:
            new_list.append(i)
        else:
            pass
    length=len(new_list)
    return length


num=[]
for i in range(10):
    a=int(input())
    num.append(a)
    
resultList=[]
for i in num:
    resultList.append(remainder(i))

print(checknum(resultList))