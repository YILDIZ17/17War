package game;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class War {

    public static void main(String[] args) {
        String[] colors = { "Hearts", "Diamonds", "Spades", "Clubs" };
        Scanner scanner = new Scanner(System.in);

        System.out.println();
        System.out.println("Welcome to the ultimate battle in the \"17'War\" card game.");

        do {
            List<Card> deck = new ArrayList<Card>();

            // Creating the deck
            for (String color : colors) {
                for (int i = 1; i <= 13; i++) {
                    deck.add(new Card(color, i));
                }
            }

            // Shuffling the deck
            Collections.shuffle(deck);

            // Creating players
            System.out.println();
            System.out.print("\tPlayer 1, enter your username : ");
            String usernamePlayer1 = scanner.nextLine().toUpperCase();
            Player player1 = new Player(usernamePlayer1);

            System.out.print("\tPlayer 2, enter your username : ");
            String usernamePlayer2 = scanner.nextLine().toUpperCase();
            Player player2 = new Player(usernamePlayer2);
            System.out.println();

            try {
                Thread.sleep(500); // Pause for 1 second
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            System.out.println("The players are ready : " + player1.getUsername() + " and " + player2.getUsername());
            System.out.println();

            try {
                Thread.sleep(2000); // Pause for 1 second
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            // Dealing cards
            for (int i = 0; i < deck.size(); i++) {
                if (i % 2 == 0) {
                    player1.drawCard(deck.get(i));
                } else {
                    player2.drawCard(deck.get(i));
                }
            }

            // Clear the console screen
            clearConsole();

            // Game loop
            for (int i = 0; i < 26; i++) {
                Card player1Card = player1.getDeck().get(i);
                Card player2Card = player2.getDeck().get(i);

                System.out.println("Round " + (i + 1) + " - " + player1.getUsername() +  "'s card : " + player1Card);
                try {
                    Thread.sleep(1000); // Pause for 1 second
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("Round " + (i + 1) + " - " + player2.getUsername() +  "'s card : " + player2Card);
                try {
                    Thread.sleep(1000); // Pause for 1 second
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                int result = player1Card.compareTo(player2Card);
                if (result == 1) {
                    player1.incrementScore();
                    System.out.println(player1.getUsername() + " wins this round !\n");
                } else if (result == -1) {
                    player2.incrementScore();
                    System.out.println(player2.getUsername() + " wins this round !\n");
                } else {
                    System.out.println("It's a tie !\n");
                }

                // Pause between rounds
                try {
                    Thread.sleep(1000); // Pause for 2 seconds
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

            // Clear the console screen
            clearConsole();

            // Display the score
            System.out.println("Final Score :");
            System.out.println(player1.getUsername() + " : " + player1.getScore() + " points");
            System.out.println(player2.getUsername() + " : " + player2.getScore() + " points\n");

            // Display the winner
            if (player1.getScore() > player2.getScore()) {
                System.out.println(player1.getUsername() + " wins the game !");
            } else if (player1.getScore() < player2.getScore()) {
                System.out.println(player2.getUsername() + " wins the game !");
            } else {
                System.out.println("It's a tie!");
            }

            // Ask the user if they want to play again
            String playAgain;
            while (true) {
                System.out.print("\nDo you want to play again? (yes / no) : ");
                playAgain = scanner.nextLine().toLowerCase();

                if (playAgain.equals("yes") || playAgain.equals("no")) {
                    break;
                } else {
                    System.out.print("Please respond with 'yes' or 'no' ");
                }
            }

            if (playAgain.equals("no")) {
                System.out.println("Goodbye !");
                break;
            }

        } while (true);

        // Close the scanner
        scanner.close();
    }

    // Method to clear the console screen
    private static void clearConsole() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

}
