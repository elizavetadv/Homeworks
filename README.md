# Homeworks

### Included homeworks started from 21 lesson

Java: 11

### Homework 21

Tic-Tac-Toe game

### Structure of project:

1. Main.java

- calling method of Game class startGame()

2. Box.java

- static variable for storing a box that will change during the game
- method createBox() - creates empty box
- method printBox()

3. Cell.java

- method checkCell(String key)
- method addInCell(String key) - this method is for user (if selected cell isn't empty, calling method enterCorrectValue() from class Utils)
- method AddInCellComp() - method for computer: random value is selected from a set of keys, this cell is checked for emptiness by method checkCell() and the cell is filled if it is empty, if not, the method is called again to generate a new key
- method stopOrMakeWin(String player) - computer puts "O" near (between) two "X" to prevent the user from winning, and near (between) two "O" to win

4. Game.java

- method oneGame() - includes a single game scenario
     - drawing an empty box
     - calling method enterCorrectValue() from class Utils
     - calling method addInCell from class Cell
     - print box with method print from class Box
     - checking if there is a winner at this stage and exiting the game if so
     - checking whether the game is over (there are 9 cells, the computer goes 4 times, the user 5, so this check is before the computer moves)
     - computer's turn. checking if there are two "O" next to each other, then two "X", if not, select a random cell
     - print box
     - another check on the winner
     - next iteration
     - loop for the user to enter the answer to the question "continue the game?" with verification of the entered response

6. Utils.java

- method checkEnteredData(String str) - checks that the cell selected by the user has been entered correctly
- method enterCorrectValue() - input and verification of user-entered data
