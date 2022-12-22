package pr2_9;

import java.util.Scanner;

public class Poker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of players: ");
        int n = scanner.nextInt();

        Card[] deck = new Card[52];

        for(int i = 0; i < deck.length; i++)
        {
            deck[i] = new Card();

            if(i < 13)
            {
                deck[i].suit = "chervi";
                deck[i].num = deck[i].Num(i);
            }

            if(13 <= i && i < 26)
            {
                deck[i].suit = "bybi  ";
                deck[i].num = deck[i].Num(i);
            }

            if(26 <= i && i < 39)
            {
                deck[i].suit = "kresti";
                deck[i].num = deck[i].Num(i);
            }

            if(39 <= i)
            {
                deck[i].suit = "piki  ";
                deck[i].num = deck[i].Num(i);
            }

            //System.out.println(deck[i].suit +" " + deck[i].num);
        }

        int size = 52;
        int count_cards = 0;
        for(int i = 0; i < n; i++) {
            System.out.print((i + 1) + "player   ");
        }
        System.out.println(""+ "");
        for( int j = 0; j < 5; j++) {
            for (int i = 0; i < n; i++) {
                int rand = (int) (Math.random() * (size - 1)) + 0;
                count_cards++;
                if (count_cards <= deck.length) {
                    System.out.print(deck[rand].num + " " + deck[rand].suit + "  ");
                }else{
                    System.out.print("карт нет  ");
                }

                for (int t = rand; t < size - 1; t++) {
                    deck[t] = deck[t + 1];
                }

                size--;
            }
            System.out.println("  ");
            System.out.println("");
        }
    }

}
