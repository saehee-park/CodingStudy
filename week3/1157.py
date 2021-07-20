a=input().upper()
word=list(set(a))

cnt_list=[]
for i in word:
    cnt=a.count(i)
    cnt_list.append(cnt)

if cnt_list.count(max(cnt_list))>=2:
    print("?")
else:
    print(word[cnt_list.index(max(cnt_list))])
