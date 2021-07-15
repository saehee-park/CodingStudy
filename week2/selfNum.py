# 백준 4673

num_set = set(range(1, 10001))

not_self_num= set()

for i in range(1, 10001):
    for j in str(i): 
        i += int(j) 

    not_self_num.add(i)

self_num = num_set - not_self_num

for i in sorted(self_num):
    print(i)