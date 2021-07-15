#1.음계
a=list(map(int,input().split()))
result=True
if a[0]==1:
    for i in range(7):
        if a[i]==i+1:
            result=True
        else:
            result=False
elif a[0]==8:
    for i in range(7):
        if a[i]==8-i:
            result='reverse'
        else:
            result=False
else:
    result=False

if result==True:
    print('ascending')
elif result=='reverse':
    print('descending')
else:
    print('mixed')

#2.블랙잭
import random

n,m=list(map(int,input().split()))

num=list(map(int,input().split()))
result=0

for i in range(len(num)-2):
    for j in range(i+1,len(num)-1):
        for k in range(j+1,len(num)):
            if num[i]+num[j]+num[k]>m:
                pass
            else:
                if result<=num[i]+num[j]+num[k]:
                    result=num[i]+num[j]+num[k]
print(result)

#알파벳 개수
a=input()
cnt=0
apt=['a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z']
for i in range(len(apt)):
    cnt=a.count(apt[i])
    print(cnt,end="")

#알파벳 찾기
a=input()
result=0
apt=['a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z']
for i in range(len(apt)):
    if apt[i] in a:
        result=a.find(apt[i])
    else:
        result=-1
    print(result,end="")

#문자열 분석
def isSmall(n):
    cnt=0
    for i in n:
        if i in 'abcdefghijklmnopqrstuvwxyz':
            cnt+=1
        else:
            pass
    return cnt

def isBig(n):
    cnt=0
    for i in n:
        if i in 'ABCDEFGHIJKLMNOPQRSTUVWXYZ':
            cnt+=1
        else:
            pass
    return cnt

def isNum(n):
    cnt=0
    for i in n:
        if i in '1234567890':
            cnt+=1
        else:
            pass
    return  cnt

def isBlank(n):
    cnt=0
    for i in n:
        if i in ' ':
            cnt+=1
        else:
            pass
    return cnt

def check(a):
    List=[isSmall(a),isBig(a),isNum(a),isBlank(a)]
    for i in range(len(List)):
        print(List[i],end=" ")
    print()

n=int(input())
List1=[]
while n>0:
    a=input()
    List1.append(a)
    n-=1

for i in range(len(List1)):
    check(List1[i])

#단어 길이 재기
a=input()
print(len(a))

#ROT13
LS1=['a','b','c','d','e','f','g','h','i','j','k','l','m']
LS2=['n','o','p','q','r','s','t','u','v','w','x','y','z']
LL1=['A','B','C','D','E','F','G','H','I','J','K','L','M']
LL2=['N','O','P','Q','R','S','T','U','V','W','X','Y','Z']

def TurnSmall1(n):
    for i in n:
        if i in LS1:
            a=LS1.index(i)
            n.replace(i,LS2[a])
    return n
def TurnSmall2(n):
    for i in n:  
        if i in LS2:
            a=LS2.index(i)
            n.replace(i,LS1[a])

    return n

def TurnBig1(n):
    for i in n:
        if i in LL1:
            a=LL1.index(i)
            n.replace(i,LL2[a])
    return n
def TurnBig2(n):
    for i in n:       
        if i in LL2:
            a=LL2.index(i)
            n.replace(i,LL1[a])
        
    return n

n=input()
TurnSmall1(n)
TurnSmall2(Turnsmall1(n)))
TurnBig1(TurnSmall2(TurnSmall(n)))
print(TurnBig2(TurnBig1(TurnSmall2(TurnSmall(n)))))


#네수
n=list(map(str,input().split()))
a=n[0]+n[1]
b=n[2]+n[3]
print(int(a)+int(b))

#접미사 배열
s=input()
List=[]
for i in range(len(s)):
    a=s[i:]
    List.append(a)

List.sort()

for i in List:
    print(i)

# #괄호
def check(n):
    i=0
    ans=True
    cnt1=n.count('(')
    cnt2=n.count(')')
    
    if cnt1==cnt2:
        ans=True
    else:
        ans=False
    
    if ans==True:
        return 'YES'
    else:
        return 'NO'
      
n=int(input())
List=[]
for i in range(n):
    a=input()
    List.append(a)
    
for i in range(n):
    print(check(List[i]))