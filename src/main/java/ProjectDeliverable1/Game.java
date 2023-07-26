package ProjectDeliverable1;

import java.util.ArrayList;

/**
 * The class that models your game.
 */
public abstract class Game {
    private final String name;
    private ArrayList<Player> players;
    private GroupOfCards deck;

    public Game(String name) {
        this.name = name;
        players = new ArrayList<>();
        deck = new GroupOfCards(0);
    }

    public String getName() {
        return name;
    }

    public ArrayList<Player> getPlayers() {
        return players;
    }

    public void setPlayers(ArrayList<Player> players) {
        this.players = players;
    }

    public GroupOfCards getDeck() {
        return deck;
    }

    public void setDeck(GroupOfCards deck) {
        this.deck = deck;
    }

    public abstract void play();

    public abstract void declareWinner();
}
