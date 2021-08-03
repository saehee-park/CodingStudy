N, M = map(int, input().split()) # N:기타줄 M:브랜드
List = []
set = []
one = []

for i in range(M):
    List.append(list(map(int, input().split())))

for i in range(M):
    set.append(List[i][0])
    one.append(List[i][1])

if min(set) > min(one)*6:
    print(min(one)*N)
else:
    if min(set) > min(one)*(N%6):
        print(min(set)*((N//6)) + min(one)*(N%6))
    else:
        print(min(set)*((N//6)+1))