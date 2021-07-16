N = int(input())
home = list(map(int, input().split())) #리스트

home.sort()

print(home[(N-1)//2])