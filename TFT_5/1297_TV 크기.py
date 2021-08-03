import math # srrt(루트), floor(내림)할 때  필요

D, H, W = map(int, input().split())

h = math.floor((D/(math.sqrt(H*H+W*W)))*H)
w = math.floor((D/(math.sqrt(H*H+W*W)))*W)

print(h, w)