N = int(input())
cnt = 0
num = 0
ans = ''

while(N > cnt):

    if N == 1:
        ans = '666'
        break

    elif str(num)[-1] == '6':
        for i in range(10):
            ans =  str(num) + '66' + str(i)
            cnt += 1
            if N == cnt:
                break
        num += 1

    else:
        ans = str(num)+'666'
        cnt += 1
        num += 1

print(ans)