List = []
cnt = 0
for i in range(8):
    List.append(input())

for i in range(8):
    for j in range(8):
        if (i+j)%2 == 0: #하얀칸
            if List[i][j] == 'F':
                cnt += 1       
print(cnt)