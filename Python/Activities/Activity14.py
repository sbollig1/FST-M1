number =int(input("Please enter a number upto which you require the fibbanoci series upto: "))
def fibonacci(number):
    if number <= 1:
        return number
    else:
        return(fibonacci(number-1) + fibonacci(number-2))

    
for i in range(number):
       str1 = str(fibonacci(i))
       print(str1)
