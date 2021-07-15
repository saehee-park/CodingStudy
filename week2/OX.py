#백준 8958

n = int(input())
for i in range(n):
    num = input()
    li = list(num)
    sum = 0
    score = 1
    for i in li:
        if i == 'O':
            sum += score
            score += 1
        else:
            score = 1
    print(sum)