def pal(s):
    if len(s) <= 1:
        return True
    else:
        return s[0] == s[-1] and pal(s[1:-1])

while(True):
    char = input()
    if char == '0':
        break
    else:
        if pal(char) == True:
            print("yes")
        else:
            print("no")