# N = int(input())

# for i in range(1, N+1):
#     ans = i
#     strI = str(i)
#     for j in range(len(strI)):
#         ans += int(strI[j])

#     if ans == N:
#         print(i)
#         break
    
#     if i == N:
#         print(0)

N = int(input())

sli = 0
result = 0
for i in range(1, N+1):
    sli = list(map(int, str(i)))
    result = i + sum(sli)

    if result == N:
        print(i)
        break

    if i==N:
        print(0)