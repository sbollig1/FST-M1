mylist = list(input("Please enter a list").split(' '))
print(mylist)
sum=0
for num in mylist:
    sum = int(num) + sum
print(sum)