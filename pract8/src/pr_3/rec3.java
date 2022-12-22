package pr_3;

import java.util.Scanner;

public class rec3 {
    static void zad_3(int amount,int max) {
        if (amount<=max) {
            System.out.print(amount + " ");
            if (amount < max)
                zad_3(amount + 1, max);
        }
        else {
            System.out.print(max + " ");
            if (max < amount)
                zad_3(amount, max +1);
        }
    }
    public static void main(String[] args) {
        System.out.print("2) ОТ A до B Введите A and B:");
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        int y = in.nextInt();
        zad_3(x,y);
        System.out.println();
    }
}
