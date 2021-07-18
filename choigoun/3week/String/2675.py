import sys

t = sys.stdin.readline()

data_list = []

for i in range(int(t)):
    r, string_data = sys.stdin.readline().split()
    data = ''

    for j in string_data:
        data += j*int(r)
        
    data_list.append(data)

for i in range(int(t)):
    print(data_list[i])

