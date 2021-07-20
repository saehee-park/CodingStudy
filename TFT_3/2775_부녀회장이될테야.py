T = int(input())

for i in range(T):
    k = int(input()) #층
    n = int(input()) #호

    List = [list(range(1,n+1))] # 0째 index에 0층 원소 만들기

    for i in range(1, k+1):
        List.append([])

        for j in range(n):
            if j == 0:
                List[i].append(1)
            else:
                List[i].append(List[i-1][j]+List[i][j-1])
    print(List)
    print(List[k][n-1])
    
