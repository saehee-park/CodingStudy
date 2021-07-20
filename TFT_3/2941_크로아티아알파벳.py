List = ['c=', 'c-', 'dz=', 'd-', 'lj', 'nj', 's=', 'z=']
word = input()

for e in List:
    word = word.replace(e,'0')
print(len(word))