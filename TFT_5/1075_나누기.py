N = int(input())
F = int(input())
n = (N//100)*100

while (True):
    if n%F == 0:
        print(str(n)[-2:])
        break
    else:
        n += 1