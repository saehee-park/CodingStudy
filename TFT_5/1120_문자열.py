A, B =  map(str,input().split())
List = []

for i in range(len(B)-len(A)+1):
    ans = 0
    for j in range(len(A)):
        if A[j] != B[i+j]:
            ans += 1
    List.append(ans)
print(min(List))