while True:
    
    small = 0
    capital = 0
    Int = 0
    blank = 0

    try:
        StrList = list(input()) 

        for i in range(len(StrList)):
            if StrList[i] in "abcdefghijklmnopqrstuvwxyz":
                small += 1
            if StrList[i] in "ABCDEFGHIJKLMNOPQRSTUVWXYZ":
                capital += 1
            if StrList[i] in "0123456789":
                Int += 1
            if StrList[i] in " ":
                blank += 1
        print(small, " ", capital, " ", Int, " ", blank)
    
    except EOFError:
        break

    
# while True:
#     try:
#         small = 0
#         capital = 0
#         Int = 0
#         blank = 0
#         StrList = list(input()) 

#         for i in range(len(StrList)):
#             if StrList[i] in "abcdefghijklmnopqrstuvwxyz":
#                 small += 1
#             if StrList[i] in "ABCDEFGHIJKLMNOPQRSTUVWXYZ":
#                 capital += 1
#             if StrList[i] in "0123456789":
#                 Int += 1
#             if StrList[i] in " ":
#                 blank += 1
#         print(small, " ", capital, " ", Int, " ", blank)
    
#     except EOFError:
#         break