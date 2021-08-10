import sys

for _ in range(3):
    N = int(sys.stdin.readline())
    li = [int(sys.stdin.readline()) for i in range(N)]
    if sum(li) == 0:
        print("0")
    elif sum(li) > 0:
        print("+")
    else:
        print("-")