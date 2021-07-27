s = int(input())

bag = 0
while s >= 0 :
    if s % 5 == 0 : 
        bag += (s // 5) 
        print(bag)
        break
    s -= 3  
    bag += 1
else :
    print(-1)
