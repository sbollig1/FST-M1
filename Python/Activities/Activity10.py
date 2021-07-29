intTuple = tuple(input("Please enter a tuple of numbers seperated by comma   ").split(','))
print("Given List is ",intTuple)
print("The numbers in list which are divided by 5 are: ")
for num in intTuple:
    if(int(num)%5 ==0):
        print(num)