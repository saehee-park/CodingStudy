n = int(input())
first = 1
room = 6
result = 1
if n==1:
    print(1)
else:
    while True:
        first = first+room
        result +=1
        if n<=first:
            print(result)
            break
        room+=6