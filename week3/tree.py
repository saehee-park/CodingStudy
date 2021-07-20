#백준 2805
import sys

num, need = map(int, sys.stdin.readline().split())
tree_li = list(map(int, input().split()))
start, end = 0, max(tree_li)

while start<=end:
    mid = (start+end)//2
    tree = 0

    for i in tree_li:
        if i >mid:
            tree += i -mid
        
    if tree >= need:
        start = mid+1
    else:
        end = mid-1
print(end)

#시간초과