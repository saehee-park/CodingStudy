import sys
N = int(sys.stdin.readline())

numbers = [] 
for i in range (N):
    numbers.append(tuple(map(int,sys.stdin.readline().split()))) 

numbers.sort() 
for i in range (len(numbers)):
    print("%d %d"%(numbers[i][0],numbers[i][1]))
