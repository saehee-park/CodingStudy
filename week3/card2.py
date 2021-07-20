#백준 10816
import sys

n = int(sys.stdin.readline())
card = list(map(int, sys.stdin.readline().split()))
card.sort()

m = int(sys.stdin.readline())
target = list(map(int, sys.stdin.readline().split()))

dic = {}

for i in card:
    if i not in dic:
        dic[i] = 1
    else:
        dic[i]+=1

for i in target:
    start = 0
    end = n-1

    while start<=end:
        mid = (start+end)//2

        if card[mid] == i:
            break

        if card[mid] > i:
            end = mid-1
        else:
            start = mid+1
    
    if card[mid] == i:
        print(dic[i], end = " ")
    else:
        print(0, end = " ")


