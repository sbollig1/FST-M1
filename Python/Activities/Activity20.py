import pandas

exceltable = pandas.read_excel("sameplexls.xlsx","Sheet1")
print("File Contents:")
print(exceltable)
print("---------------")
print("Number of colmns and Rows are: ", exceltable.shape)
print("---------------------")
print("the Emails are as below")
print(exceltable["Email"])
print("---------------------")
print('The table sorted by First Name')
print(exceltable.sort_values("FirstName"))