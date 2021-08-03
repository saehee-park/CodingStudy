import sys

N = int(sys.stdin.readline())
List = list(map(int, sys.stdin.readline().split()))
NewList = []

for i in range(N): # 소수판별 후 새로운 리스트 만들기
    flag1 = []
    for j in range(2, List[i]):
        if List[i]%j != 0:
            flag1.append(True)
        else:
            flag1.append(False)
    if False in flag1:
        continue
    else:
        NewList.append(List[i])

ans = NewList[-1]+1
mul = 1
for i in range(len(NewList)):
    mul *= NewList[i]

while(ans<=mul): # 소수의 최소 공배수 출력
    flag2 = []
    for i in range(len(NewList)):
        if ans%NewList[i] == 0:
            flag2.append(True)
        else:
            flag2.append(False)
            
    if False in flag2:
        ans += 1   
    else:
        print(ans)
        break

    #시간 초과