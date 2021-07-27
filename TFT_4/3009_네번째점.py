x_y = []
x = []
y = []
ansX = 0
ansY = 0

for i in range(3):
    num= list(map(int, input().split()))
    x_y.append(num)

for i in range(3):
    x.append(x_y[i][0])
    y.append(x_y[i][1])

x.sort()
y.sort()

for i in range(3):
    if x[1] != x[i]:
        ansX = x[i]
    
    if y[1] != y[i]:
        ansY = y[i]

print(ansX, ansY)