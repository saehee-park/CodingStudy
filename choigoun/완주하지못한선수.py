


def solution(participant, completion):
    participant.sort() # 둘다 정렬시킨 후 같은 인덱스의 요소 비교하기 
    completion.sort()

    for i in range(len(completion)):
        if participant[i] != completion[i]:
            return participant[i] # 정렬했기 때문에 같은 인덱스의 요소가 다르면 return 
    # 그것도 아니라면 비교 안 한 가장 마지막 participant 값이 정답이므로 return 
    return participant[-1]



participant = ["mislav", "stanko", "mislav", "ana"]
completion = ["stanko", "ana", "mislav"]

print(solution(participant,completion))


# counter 함수도 이용가능?

