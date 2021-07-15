def my_max(grade):
    a=grade[0]
    for i in grade:
        if i>a:
            a=i
    return a

def my_grade(grade):
    Max=my_max(grade)
    new_grade=[]
    for i in grade:
        new=i/Max*100
        new_grade.append(new)
    
    return new_grade

def my_avg():
    avg_grade=my_grade(grade)
    Sum=0
    for i in avg_grade:
        Sum+=i
    result=Sum/len(avg_grade)
        
    return result

n=int(input())
grade=list(map(int,input().split()))
print(my_avg())