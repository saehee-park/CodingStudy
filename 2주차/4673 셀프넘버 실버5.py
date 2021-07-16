
arr = list(range(1,10000))
def eraseselfnum(i):
    while i< 10000:
        sum= i
        for j in str(i):
            sum += int(j)
        try:
            arr.remove(sum)
            i += 1
        except:
            i += 1            

eraseselfnum(1)
for i in arr:
    print(i)

