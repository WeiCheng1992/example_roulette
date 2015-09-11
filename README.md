####Group: cw272,wj43

### Refactor the Code


1. What methods would make sense as behaviors of a Bet hierarchy (i.e., make bets open to extension)? <br />
The method of outputing the information before the player plays this round.(function placeBet()).<br />
The method of judging whether the player wins or not in this round in different rules(function judgeWin(Wheel wheel)).<br />
Because all of these methods will vary from method to method.If we create new rule , output and input.The type of bet will be totally different.

2. What methods would help improve the code in the Game's methods (i.e., close it to modification)?<br />
We made some abstract methods in bet class,which can be implemented by its derived class.These methods can reduce the condition , switch sentences  and for loop.

3. What methods can be completely implemented in the Bet super-class (i.e., are common across the hierarchy), and which completely in the Bet sub-classes (i.e., vary across the hierarchy)?<br />
The methods of getOdd and getDescription can be implemented in super-class . Moreover , we create two functions of input the choice the gambler makes this round and caculating the amount of money he wins or loses.These are in the based class.<br />
The judging rule and the function of recieving the choice should be in the sub class.
4. How should the Game class create the correct Bet subclass?<br />
By creating the bet list containing all kinds of bets at the very beginning of the Game initialization.


###Add New Features
1. In what ways is the refactored code simpler?<br />
If we add a new kind of bet ,we just need to modify very little part of game class.
2. In what ways is the refactored code more complex?<br />
Every new feature needs a new class.
3. What trade-offs did you make when refactoring your old code?<br />
No trade-off.
4. Which code do you prefer and why?<br />
I think the refactored one is better.Because there is less dependency. We doesn't need to modify the majority of code when we add a new feature.It is easier to do the extention.
