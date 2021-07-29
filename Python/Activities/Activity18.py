import pandas

csvfile = pandas.read_csv("sample.csv")
print("Second row of the file: ")
print("Username:",csvfile["Usernames"][1],"Passwords:",csvfile["Passwords"][1])
print("=============")
print("Actuall file content")
print(csvfile)
print("============")
print("Username in ascending order:")
print(csvfile.sort_values("Usernames", ascending="true"))
print("==============")
print("Passwords in descending order:")
print(csvfile.sort_values("Passwords", ascending='false'))