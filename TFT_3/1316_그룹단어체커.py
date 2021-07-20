N = int(input())
word = []
cnt = 0

for i in range(N):
    word.append(input())

for i in range(len(word)):
    List = []
    flag = True
    for j in range(len(word[i])):
        if word[i][j] in List:
            if word[i][j] == word[i][j-1]:
                continue
            else:
                flag = False
                break
        else:
            List.append(word[i][j])
    if flag == True:
        cnt += 1

print(cnt)