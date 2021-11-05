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
- method addInCell(String key) - this method is for user
- method AddInCellComp() - method for computer: random value is selected from a set of keys, this cell is checked for emptiness by method checkCell() and the cell is filled if it is empty, if not, the method is called again to generate a new key
- method stopOrMakeWin(String player) - computer puts "O" near (between) two "X" to prevent the user from winning, and near (between) two "O" to win

4. Game.java

- method oneGame() - includes a single game scenario
     - drawing an empty box
     - user input of a cell and checking it for correctness

6. Utils.java

- method checkEnteredData(String str) - checks that the cell selected by the user has been entered correctly
