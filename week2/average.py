#백준 1546

n = int(input())
li = list(map(int, input().split()))
max_sc = max(li)

new_li = []

for sc in li:
    new_li.append(sc/max_sc*100)

avg = sum(new_li)/n

print(avg)