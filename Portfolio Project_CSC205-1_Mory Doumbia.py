numbers =  [5, 10, 12, 13, 6, 7, 1, 3, 2, 1]
total = 0
for ele in numbers:
    if ele % 2 == 0:
        total = total + ele
    else :
        total = total - ele
print("your total is : ", total)



#PSEUDOCODE
#
    #START

#     total = 0  (set total to 0)
#     FOR EACH number IN list
#          IF(EVEN(number))
#     total = total + number  (Set total to the current total + number)
#          ELSE(ODD(number))
#     total = total - number

    #DISPLAY(total)#

    #STOP