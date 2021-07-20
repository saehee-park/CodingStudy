word = input().upper()
Dict = {}

for i in word:
    if i in Dict.keys():
        Dict[i] += 1
    else:
        Dict[i] = 1
Value = list(Dict.values())
Max = Value.count(max(Value))

if Max == 1:
    for i in range(len(word)):
        if Dict[word[i]] == max(Value):
            print(word[i])
            break
else:
    print("?")