package pr_1;
import java.util.Scanner;

public class rec1 {
        static void zad_1(int amount, int max) {
            for (int i = 1; i <= amount; i++) {
                System.out.print(amount + " ");
            }
            if (amount < max)
                zad_1(amount+1,max);
        }
        public static void main(String[] args) {
            System.out.print("1) Треугольная последовательность: ");
            int x=1;
            Scanner in = new Scanner(System.in);
            int y = in.nextInt();
            zad_1(x,y);
            System.out.println();
        }
    }

