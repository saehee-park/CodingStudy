A=input()
B=input()
C=input()

num = int(A)*int(B)*int(C)
num = str(num)
for i in range(0,10):
    print(num.count(str(i)))