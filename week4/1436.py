n=int(input())
a=666
cnt=0
while True:
    if "666" in str(a):
        cnt+=1
    if cnt==n:
        break
    a+=1
print(a)