import sys

for i in range(3):
    N = int(sys.stdin.readline())
    List = []
    for j in range(N):
        List.append(int(sys.stdin.readline()))
        
    if sum(List) > 0:
        print("+")
    elif sum(List) == 0:
        print(0)
    else:
        print("-")