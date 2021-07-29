numbers = list(input("Please enter few numbers for which you need the sum seperated by comma").split(','))

def sum(numbers):
    total =0
    for num in numbers:
        total = int(num) + total
    return total

print("The sum of numbers in list", sum(numbers))