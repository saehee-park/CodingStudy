from collections import Counter

def solution(genres, plays):
    
    answer = []

    total = {} # 장르 : 총 재생 횟수

    for i in range(len(genres)):
        # key가 0개인경우 하나 만들어주기
        if genres[i] not in total.keys():

            # 곡 번호를 key로 하고 play[i] 넣기
            total[genres[i]] = {'total':plays[i], i:plays[i]}
        # key가 존재하면 
        else:
            # total에 계속해서 합해주기 (누적시키기)
            total[genres[i]]['total'] += plays[i]
            # 곡 번호에 plays[i] 입력
            total[genres[i]][i] = plays[i]
        
        # total의 items로 정렬하기 lambda 사용

    sorted_genres = sorted(total.items(),key=lambda x:x[1]['total'], reverse=True)

    for j in range(len(sorted_genres)):
        genre_dic = sorted_genres[j][1]

    






genres = ["classic", "pop", "classic", "classic", "pop"]
plays = [500, 600, 150, 800, 2500]

print(solution(genres, plays))

# 속한 노래가 많이 재생된 장르를 먼저 수록합니다.
# 장르 내에서 많이 재생된 노래를 먼저 수록합니다.
# 장르 내에서 재생 횟수가 같은 노래 중에서는 고유 번호가 낮은 노래를 먼저 수록합니다.