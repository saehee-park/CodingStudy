def my_max(num):
    a=num[0]
    for i in num:
        if i>a:
            a=i
    return a

def maxIndex(num):
    Index=0
    for i in num:
        if i==a:
            Index=num.index(i)+1
    return Index

num=[]
for i in range(9):
    a=int(input())
    num.append(a)
a=my_max(num)   
print(a)
print(maxIndex(num))