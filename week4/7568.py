n=int(input())
people=[]
for i in range(n):
    people.append(input().split())

rank=[]
for i in range(len(people)):
    cnt=1
    for j in range(len(people)):
        if people[i][0]<people[j][0] and people[i][1]<people[j][1]:
            cnt+=1
    rank.append(cnt)

for i in rank:
    print(i,end=" ")