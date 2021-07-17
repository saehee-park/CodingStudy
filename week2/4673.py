def numbers(n):
    number = int(n)
    for i in list(str(n)):
        number += int(i)
    return number

non_self_numbers = []
for i in range(1,10001):
    num = numbers(i)
    non_self_numbers.append(num)

for j in range(1,10001):
    if j in non_self_numbers:
        pass
    else:
        print(j)