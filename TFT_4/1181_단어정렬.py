N = int(input())
word = []

for i in range(N):
    word.append(input())
word.sort(key = lambda x : (len(x), x))
print(word)

for i in range(N):
    if i == 0:
        print(word[i])
    else:
        if word[i] == word[i-1]:
            continue
        else:
            print(word[i])