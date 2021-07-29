user1=input("Rock/ Paper / Scissor for user1:  ").lower()
user2=input("Rock/ Paper / Scissor for user2:  ").lower()
#print(user1)
rock='rock'
paper='paper'
scissor='scissor'
if user1==rock:
    if user2==paper:
        print("User2 wins")
    elif user2==scissor :
        print("User1 wins")
    elif user2==rock:
        print("Tie")
    else:
        print("User2 please enter a valid choice")
elif(user1==paper):
    if(user2==scissor):
        print("User2 wins")
    elif(user2==rock):
        print("User1 wins")
    elif(user2==paper):
        print("Tie")
    else:
        print("User2 please enter a valid choice")
elif(user1==scissor):
    if(user2==rock):
        print("User2 wins")
    elif(user2==paper):
        print("User1 wins")
    elif(user2==scissor):
        print("Tie")
    else:
        print("User2 please enter a valid choice")
else:
    print("User1 please enter valid option")