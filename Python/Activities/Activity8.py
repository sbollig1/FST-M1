numbers = list(input("Please enter few numbers with a space:   ").split(','))
print(numbers)
if int(numbers[0]) == int(numbers[-1]):
    print("The first and last numbers are the same")
else:
    print("The first and last numbers are not the same ")
