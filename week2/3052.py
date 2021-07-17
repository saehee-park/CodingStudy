num_list = []
for i in range(10):
    num_list.append(int(input()))

remain_list = []
for j in range(len(num_list)):
    remain_list.append(num_list[j]%42)

count_dict = {}
count = 0
for k in range(len(remain_list)):
    if remain_list[k] not in count_dict:
        count_dict[remain_list[k]] = True
        count+=1

print(count)