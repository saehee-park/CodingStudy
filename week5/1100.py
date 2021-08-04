chess=[]
for i in range(8):
    chess.append(list(map(str,list(input()))))

result=0
for i in range(8):
    for j in range(8):
        if (i+j)%2==0:
            if chess[i][j]=='F':
                result+=1

print(result)