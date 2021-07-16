import sys
arr = []
N = int(sys.stdin.readline())
for i in range(N):
    arr.append(list(map(int,sys.stdin.readline().split())))

for j in arr:
    add = 0
    n=0
    for k in range(len(j)):
        if k == 0:
            n = j[k]
        else:
            add+= j[k]
    cut = add/n
    overcut= 0 
    for k in j[1:]:
        if k> cut:
            overcut += 1

    print("{:.3f}%".format(overcut/(len(j)-1)*100))

