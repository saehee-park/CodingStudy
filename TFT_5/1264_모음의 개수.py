while(True):
    s =  input()
    if s == '#':
        break
    else:
        cnt = 0
        for i in range(len(s)):
            if s[i] in 'aeiouAEIOU':
                cnt += 1
        print(cnt)