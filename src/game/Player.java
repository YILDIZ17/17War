package game;

import java.util.ArrayList;
import java.util.List;

public class Player {

    private final String username;

    public Player(String username){
        this.username = username;
    }

    private List<Card> deck = new ArrayList<Card>();
    private int score;

    // Draw a card and add it to the player's deck
    public void drawCard(Card card) {
        this.deck.add(card);
    }

    // Accessors
    public String getUsername() {
        return username;
    }

    public List<Card> getDeck() {
        return this.deck;
    }

    public int getScore() {
        return this.score;
    }

    // Mutators
    public void setDeck(List<Card> deck) {
        this.deck = deck;
    }

    public void setScore(int score) {
        this.score = score;
    }

    // Increment the player's score
    public void incrementScore() {
        this.score++;
    }

}
