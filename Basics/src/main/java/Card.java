/**
 * Represents a single playing card with suit and rank.
 */
public class Card {

    private String suit;
    private String rank;

    /**
     * Initialize a card with a suit and rank.
     * Ensure that the suit and rank are both valid. If either is invalid,
     * throw a new InvalidCardException. An example of how do this follows:
     *
     * throw new InvalidCardException("Invalid suit: " + suit);
     *
     * @param suit suit of the card -- Heart, Diamond, Club, Spade
     * @param rank rank of the card -- Two, Three...Jack, Queen, King, Ace,
     *             Joker.
     * @throws InvalidCardException thrown if the suit or rank is invalid
     */
    public Card(String suit, String rank) throws InvalidCardException {
        // TODO: replace this with your solution
    }

    /**
     * Helper method to determine if a card is a Jack, Queen, or King.
     *
     * @return true if the card is a face card
     */
    private boolean isFaceCard() {
        // TODO: replace this with your solution
        return false;
    }

    /**
     * Returns the value of the card.
     * Two and Ace are 20
     * Three of Heart or Diamond is 0
     * Three of Club or Spade is 5
     * Four through Eight is 5
     * Nine, Ten, Jack, Queen, King is 10
     * Joker is 50.
     *
     * @return card value
     */
    public int getCardValue() {
        // TODO: replace this with your solution
        return 0;
    }

    /**
     * A String representation of the Card in the format:
     * Suit: suit; Rank: rank
     */
    public String toString() {
        return String.format("Suit: %s; Rank: %s", suit, rank);
    }

}