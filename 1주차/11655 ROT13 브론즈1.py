a= input()
output = ""
for i in a:
    small = "abcdefghijklmnopqrstuvwxyz"
    big =   "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
    if i in small:
        index = small.find(i)+13
        if index > 25:
            index = index-len(small)
        output += small[index]
    elif i in big:
        index = big.find(i)+13
        if index > 25:
            index = index-len(big)
        output += big[index]
    else:
        output += i


print(output)