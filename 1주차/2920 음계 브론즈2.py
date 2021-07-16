#2920 음계
num_list = list(map(int, input().split()))
if (num_list[0]< num_list[1]< num_list[2]< num_list[3]< num_list[4]< num_list[5] < num_list[6] < num_list[7]):
    print("ascending")
elif (num_list[0]> num_list[1]>num_list[2]> num_list[3]> num_list[4]> num_list[5] > num_list[6] > num_list[7]):
    print("descending")
else:
    print("mixed")