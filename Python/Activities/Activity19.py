import pandas

data = {
   "FirstName": ["Satvik","Avinash","Lahri"] ,
   "LastName": ["Shah","Kati","Rath"],
   "Email": ["satshah@example.com", "avinashk@example.com","lahri.rath@example.com"],
   "PhoneNumber": [4537829158, 5892184058, 4528727830]
}

table = pandas.DataFrame(data)
table.to_excel("sameplexls.xlsx")

