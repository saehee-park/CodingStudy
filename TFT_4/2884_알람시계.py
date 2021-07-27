H, M = map(int, input().split())

if M < 45:
    M = 60-(45-M)
    if H == 0:
        H = 23
    else:
        H -= 1
else:
    M -= 45

print(H, M)
