ans = 0
for i in range(8):
    li = list(input())    
    for j in range(8):
        if (i % 2) and (j % 2) and li[j] == 'F':
            ans += 1
        elif (i % 2 == 0) and (j % 2 == 0) and li[j] == 'F':
            ans += 1
print(ans)