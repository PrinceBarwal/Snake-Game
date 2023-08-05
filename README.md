# Snake Game
A Snake Game in Java is a classic arcade-style game where the player controls a snake, which moves around the screen to collect food and grow longer. The player must avoid collisions with the walls or the snake's body while trying to achieve the highest score possible. 

# Game Rules:

The game screen is represented as a grid, where each cell can either be empty, containing food, or part of the snake's body.
The snake starts with a default length and moves in a specific direction (e.g., up, down, left, or right).
The snake can change its direction using keyboard input (arrow keys or WASD keys).
When the snake consumes food, its length increases, and new food spawns at a random location on the screen.
The game ends if the snake collides with the screen's boundaries or its own body.
Key Components:

# Snake: 
Implement a class to represent the snake, which includes data members for the snake's body segments, its direction, and methods to move the snake and check for collisions.

# Food: 
Create a class for the food, which randomly spawns at different locations on the screen when the snake eats it.

# Game Loop: 
Set up a game loop that continuously updates the game state, handles user input, moves the snake, checks for collisions, and updates the score.

# User Input: 
Capture keyboard input to change the snake's direction (e.g., up, down, left, right).

# Graphics: 
Use a graphical library like Swing or JavaFX to draw the game screen, snake, food, and other elements.

# Game Flow:

Initialize the game, set up the initial snake position, food location, and score.

Enter the game loop, which repeatedly performs the following steps:

a. Check for user input to change the snake's direction.

b. Move the snake in its current direction.

c. Check for collisions with the boundaries or the snake's body. If a collision is detected, end the game.

d. Check if the snake eats the food. If so, increase the score and add a new body segment to the snake.

e. Update the game screen to reflect the current state (draw the snake, food, and other elements).

If the game ends, display the player's score and an option to restart the game.

