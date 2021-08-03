M, D, Y, T = map(str, input().split())
D = int(D[:-1])
Y = int(Y)
h, m = map(int, T.split(':'))

Mon = ["January" , "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"]
Day =  [31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31]

if Y%400 == 0 or (Y%4 == 0 and Y%100 != 0):
    Day[1] = 29
    i = Mon.index(M)
    ans = ((sum(Day[:i])+D-1)*60*24) + (h*60) + m
    print(ans/(60*24*366)*100)

else:
    i = Mon.index(M)
    ans = ((sum(Day[:i])+D-1)*60*24) + (h*60) + m
    print(ans/(60*24*365)*100)