
words = input().upper() #받은 data 대문자로 넣기
# 원래는 sys.stdin.readline()으로 입력받았었는데
# 그러니까 '\n'까지 문자열에 포함 돼 있다고? 떠서.. input()으로 해야함
# 이유는 모름


word_club = list(set(words))  # 입력받은 문자열을 중복없이 1개의 알파벳씩 넣기

count_list = []
for x in word_club :
    cnt = words.count(x)
    count_list.append(cnt)  # count 숫자를 리스트에 append

if count_list.count(max(count_list)) > 1 :  # count 숫자 최댓값이 1이상이면(여러개이면)
    print('?')

else :
    # 최댓값이 여러개가 아니면(1개이면)
    max_index = count_list.index(max(count_list))  # count 숫자 최대값 인덱스(위치)
    print(word_club[max_index])

# Tip 최댓값 요소가 여러개인지 알고 싶을 땐
# max(data)를 count해서 1개 이상인지 확인해본다 !