list1 = [7, 8 , 9 ,6 ,66 , 56 , 91, 11]
list2 = [8,7,44,22,31,77,56]

evenlist = list()
oddlist = list()

for num in list1:
    if num%2 == 0:
        evenlist.append(num)
    else:
        oddlist.append(num)

for num in list2:
    if num%2 == 0:
        evenlist.append(num)
    else:
        oddlist.append(num)



print(evenlist)
print(oddlist)
