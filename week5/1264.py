vowel='AaEeIiOoUu'
while True:
    str=input()
    if str=='#':
        break
    ans=0
    for i in str:
        if i in vowel:
            ans+=1
    print(ans)
