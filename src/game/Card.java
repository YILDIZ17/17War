package game;

public class Card {

    private String color;
    private int value;

    // Card constructor
    public Card(String color, int value) {
        this.color = color;
        this.value = value;
    }

    // Accessors
    public String getColor() {
        return this.color;
    }

    public int getValue() {
        return this.value;
    }

    // Mutators
    public void setColor(String color) {
        this.color = color;
    }

    public void setValue(int value) {
        this.value = value;
    }

    // Card comparison
    public int compareTo(Card card) {
        if (this.value > card.value) {
            return 1;
        } else if (this.value < card.value) {
            return -1;
        } else {
            return 0;
        }
    }

    // Card representation
    public String toString() {
        return this.color + " " + this.value;
    }

}
