a = input()
arr = []
for i in "abcdefghijklmnopqrstuvwxyz":
    arr.append(str(a.count(i)))
b = ' '.join(arr)
print(b)