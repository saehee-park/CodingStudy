def grade(i):
    result=1
    new_sum=0
    for k in range(len(i)):
        if i[k]=='O':
            if k+1==len(i):
                if i[k-1]=='O':
                    new_sum+=result
                    break
                else:
                    break
            else:
                if i[k+1]=='O':
                    new_sum+=result
                    result+=1
    
                else:
                    if result==1:
                        new_sum+=result
                    else:
                        new_sum+=result
                        result=1
        else:
            result=1
            
    return new_sum

n=int(input())
List=[]
for i in range(n):
    a=input()
    List.append(a)
    
for i in List:
    print(grade(i))