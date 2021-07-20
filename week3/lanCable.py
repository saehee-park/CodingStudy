#백준 1654

k, num = map(int, input().split())
lan = []
for i in range(k):
    lan.append(int(input()))
start, end = 1, max(lan)

while start<=end:
    mid = (start+end)//2
    line = 0

    for i in lan:
        line += i//mid
    
    if line>=num:
        start = mid +1
    else:
        end = mid-1

print(end)