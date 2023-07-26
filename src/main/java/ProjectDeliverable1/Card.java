package ProjectDeliverable1;

/**
 * A class to be used as the base Card class for the project. Must be general enough to be instantiated for any Card
 * game.
 */
public abstract class Card {
    private String rank;
    private String suit;

    public Card(String rank, String suit) {
        this.rank = rank;
        this.suit = suit;
    }

    @Override
    public abstract String toString();

    String getRank() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
