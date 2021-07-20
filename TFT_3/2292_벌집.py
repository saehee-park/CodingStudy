N = int(input())
room = 1
ans = 1

if N == 1:
    print(1)
else:
    while(N > room):
        room += 6*ans
        ans += 1
    print(ans)