import sys

croa = ['c=', 'c-', 'dz=', 'd-', 'lj', 'nj', 's=', 'z=']

data = input()

for i in croa: #크로아티아어 안에 존재하면 
    #대충 .으로 바꿔주고 나중에 갯수 세주기 (어차피 갯수가 중요하니까)
    data = data.replace(i,'.')
print(len(data))



