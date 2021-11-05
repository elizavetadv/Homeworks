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

### Few pictures for a complete understanding

Start view:

![image](https://user-images.githubusercontent.com/86508961/140494705-d44f9717-12cb-483a-8b75-de09a89b6ac7.png)

Enter invalid data:

![image](https://user-images.githubusercontent.com/86508961/140495018-61aee714-cd24-49d8-b7df-43390589e836.png)

Enter correct data and computer filled random cell:

![image](https://user-images.githubusercontent.com/86508961/140495137-9919b25b-9e77-467a-a957-2a0c6cef7840.png)

Trying to choose not empty cell:

![image](https://user-images.githubusercontent.com/86508961/140495286-a320ad6f-6ac3-4cc5-bbe0-b0246cb5d9e7.png)

Choose cell and computer stop user win:

![image](https://user-images.githubusercontent.com/86508961/140495408-7bfb33da-3ee8-4b82-98c1-85eb228a8d64.png)

When no one wins:

![image](https://user-images.githubusercontent.com/86508961/140495627-c25220c5-dbaa-4a58-934a-17be7439f26d.png)

When user wins:

![image](https://user-images.githubusercontent.com/86508961/140495895-1e52a2d9-0a0b-4ff2-bde6-20ec6285642c.png)

When computer wins:

![image](https://user-images.githubusercontent.com/86508961/140496091-92bb75c4-2270-4c2c-aca3-02df1d1ec4a8.png)

If the computer has a choice: to prevent the user from winning or to win himself, he will choose the second:

![image](https://user-images.githubusercontent.com/86508961/140496916-794f0146-2e79-470d-96f6-1cabb2d7bfa6.png)
