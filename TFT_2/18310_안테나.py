N = int(input())

address = list(map(int, input().split()))
address.sort()

print(address[(N-1)//2])