
def sum(i):
    if(i == 0):
        return 0
    else:
        return i+sum(i-1)

print("The addition of 10 numbers is", sum(10))