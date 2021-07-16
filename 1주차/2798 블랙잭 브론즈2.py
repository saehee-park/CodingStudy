#2798 블랙잭

number_of_num, max_num = map(int,input().split())
num_list = list(map(int, input().split()))

close_num = 0

# for first in range(number_of_num):
#     for second in range(first+1,number_of_num):
#         for third in range(second+1, number_of_num):
#             print(num_list[first],num_list[second],num_list[third])
#             if num_list[first]+num_list[second]+num_list[third] <= max_num and num_list[first]+num_list[second]+num_list[third]>= close_num :
#                 close_num = num_list[first]+num_list[second]+num_list[third]


for first in range(number_of_num-2):
    for second in range(first+1,number_of_num-1):
        for third in range(second+1, number_of_num):
            print(num_list[first],num_list[second],num_list[third])
            if num_list[first]+num_list[second]+num_list[third] <= max_num and num_list[first]+num_list[second]+num_list[third]>= close_num :
                close_num = num_list[first]+num_list[second]+num_list[third]


print(close_num)
