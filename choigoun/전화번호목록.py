
# 효율성에서 걸렸으나
# 이런 것들이 있을 까봐 12 135 124829  2중 for문 사용했으나
# sort를 하면 그럴일이 없으므로 i 와 i+1 값만 비교해주면 됨!!

def solution(phone_book):
    answer = True
    phone_book.sort()
    for i in range(len(phone_book)-1):
        if phone_book[i] == phone_book[i+1][0:len(phone_book[i])]:
            answer = False
            break # break -> 효율성 때문, return False ㄴㄴ
    return answer

# phone_book = ["119", "1195524421",976,"97674223"]
# phone_book = ["123","456","789"]
phone_book = ["12","123","1235","567","88"]
print(solution(phone_book))
