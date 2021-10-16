public class Problem2Cards
{
    public static String cardGetNumber(int card)
    {
        return switch (card % 13)
                {
                    case 2, 3, 4, 5, 6, 7, 8, 9, 10 -> Integer.toString(card % 13);
                    case 0 -> "King";
                    case 11 -> "Jack";
                    case 12 -> "Queen";
                    default ->  "Ace";
                };
    }

    public static String cardGetColour(int card)
    {
        return switch (card / 13)
                {
                    case 0 -> "Spades";
                    case 1 -> "Harts";
                    case 2 -> "Clubs";
                    default -> "Diamonds";
                };
    }

    public static String cardToString(int card)
    {
        return cardGetNumber(card) + " of " + cardGetColour(card);
    }

    public static void main(String[] args)
    {
        final int CARDS_IN_DECK = 52;
        boolean[] used = new boolean[CARDS_IN_DECK];

        for(int i = 0; i < 4; ++ i)
        {
            int nextCard;
            do
            {
                nextCard = (int) (Math.random() * 52);
            } while (used[nextCard]);

            used[nextCard] = true;

            System.out.println(cardToString(nextCard));
        }
    }
}
