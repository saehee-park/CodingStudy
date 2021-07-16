N= int(input())
def onenumber(N):
    sum = 0
    if N>= 1 and N<100:
        sum += N
    elif N >= 100:
        sum += 99
        for i in range(100,N+1):
            i = str(i)
            a = int(i[0])
            b = int(i[1])
            c = int(i[2])
            if a-b == b-c:
                sum+=1
    return sum
print(onenumber(N))