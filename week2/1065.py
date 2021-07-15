def han(n):
    result=0
    if n<100:
        return n
    else:
        for i in range(100,n+1):
            A=i//100
            B=(i%100)//10
            C=i%10

            if (A-B)==(B-c):
                result+=1
        return result+99
        
n=int(input())
print(han(n))