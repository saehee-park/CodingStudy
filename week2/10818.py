def my_max(num):
    a=num[0]
    for i in num:
        if i>a:
            a=i
    return a

def my_min(num):
    a=num[0]
    for i in num:
        if i<a:
            a=i
    return a

n=int(input())
num=list(map(int,input().split()))
print(my_min(num),end=" ")
print(my_max(num))
