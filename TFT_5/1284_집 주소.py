while(1):
    num = input()
    cnt = len(num)+1
    if num == '0':
        break
    else:
        for i in range(len(num)):
            if num[i] == '1':
                cnt += 2
            elif num[i] == '0':
                cnt += 4
            else:
                cnt += 3
    print(cnt)