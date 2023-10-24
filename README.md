# 17'War Card Game

The "17'War" card game is a simple two-player card game where the goal is to win as many rounds as possible. This README provides an overview of the game and its features.

## Table of Contents
- [Rules of the Game](#rules-of-the-game)
- [Features](#features)
    - [Custom Player Names](#custom-player-names)  <!-- Moved to the first position -->
    - [Pause Between Rounds](#pause-between-rounds)
    - [Replay Option](#replay-option)
- [How to Run the Game](#how-to-run-the-game)

## Rules of the Game
The "17'War" card game is played with a standard deck of 52 cards. Here are the basic rules:

- The deck is divided evenly between two players, giving each player 26 cards.
- In each round, both players reveal the top card from their deck.
- The player with the higher card value wins the round and earns a point.
- If the cards have the same value, it's a tie, and no one gets a point.
- The game continues for 26 rounds, and the player with the most points at the end wins the game.
- If the scores are tied at the end of 26 rounds, the game ends in a tie.

## Features
### Custom Player Names  <!-- Moved to the first position -->
You can choose custom names for the two players before starting the game. When you run the game, you'll be prompted to enter the names for "Player 1" and "Player 2". Enjoy the game with personalized player names!

### Pause Between Rounds
To make the game more engaging and visually appealing, there is a brief pause (1 second) between each round. This allows players to see the outcome of each round before moving on to the next one.

### Replay Option
After completing a game, players are given the option to replay. You can choose to start a new game or exit. If you choose to replay, the game will reset, and you can play another round.

## How to Run the Game
1. Compile the Java code for the game.

    ```sh
    javac Card.java Player.java War.java
    ```

2. Run the War class to start the game.

    ```sh
    java War
    ```

3. Follow the on-screen prompts to play the game. You'll be asked if you want to play again after each game ends. If you choose to exit, the program will terminate.

Enjoy playing the "17'War" card game with your friends and have fun trying to outscore each other!

Tumay YILDIZ