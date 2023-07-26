package ProjectDeliverable1;

import java.util.Scanner;

/**
 * A class that represents the High Card Win game.
 */
public class HighCardWinGame extends Game {

    public HighCardWinGame(String name) {
        super(name);
    }

    @Override
    public void play() {
        System.out.println("Welcome to High Card Win Game!");
        Scanner scanner = new Scanner(System.in);

        // Deal one card to each player
        for (Player player : getPlayers()) {
            GroupOfCards deck = getDeck();
            player.getHand().getCards().add(deck.getCards().remove(0));
        }

        // Compare card ranks and determine the winner
        int maxRankIndex = 0;
        int maxRankValue = -1;

        for (int i = 0; i < getPlayers().size(); i++) {
            Player player = getPlayers().get(i);
            Card card = player.getHand().getCards().get(0);

            System.out.println(player.getName() + " plays: " + card);

            // Update the maximum rank and its player index
            int rankValue = getRankValue(card.getRank());
            if (rankValue > maxRankValue) {
                maxRankValue = rankValue;
                maxRankIndex = i;
            }
        }

        // Declare the winner
        Player winner = getPlayers().get(maxRankIndex);
        System.out.println("The winner is: " + winner.getName());

        scanner.close();
    }

    @Override
    public void declareWinner() {
        // In this simple version of the game, the winner is declared in the play() method itself.
        // You can add more logic here if needed for a more sophisticated version.
    }

    // Helper method to convert card rank to numeric value
    private int getRankValue(String rank) {
        return switch (rank) {
            case "2" -> 2;
            case "3" -> 3;
            case "4" -> 4;
            case "5" -> 5;
            case "6" -> 6;
            case "7" -> 7;
            case "8" -> 8;
            case "9" -> 9;
            case "10" -> 10;
            case "J" -> 11;
            case "Q" -> 12;
            case "K" -> 13;
            case "A" -> 14;
            default -> -1;
        }; // Invalid rank
    }
}
