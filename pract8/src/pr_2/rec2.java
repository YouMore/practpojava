package pr_2;
import java.util.Scanner;

public class rec2 {
    static void zad_2(int amount, int max) {
        System.out.print(amount + " ");
        if (amount < max)
            zad_2(amount+1,max);
    }
    public static void main(String[] args) {
        System.out.print("2) ОТ 1 до n Введите n:");
        int x=1;
        Scanner in = new Scanner(System.in);
        int y = in.nextInt();
        zad_2(x,y);
        System.out.println();
    }
}