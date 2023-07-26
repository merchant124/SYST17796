package ProjectDeliverable1;

/**
 * A class that models each Player in the game.
 */
public abstract class Player {
    private String name;
    private GroupOfCards hand;

    public Player(String name) {
        this.name = name;
        hand = new GroupOfCards(0); // Player's hand starts empty
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public GroupOfCards getHand() {
        return hand;
    }

    public void setHand(GroupOfCards hand) {
        this.hand = hand;
    }

    public abstract void play();
}
