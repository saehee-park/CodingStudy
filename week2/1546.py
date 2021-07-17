N = int(input())
score = list(map(int,input().split()))
score_max = max(score)

new_list = []
for i in score:
    new_list.append(i/score_max*100)
test_avg = sum(new_list)/N
print(test_avg)