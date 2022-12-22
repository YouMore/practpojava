package pr3_zad2;

import java.util.Scanner;

public class Test
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("How much money do you have(rubles)?");
        double rubles = sc.nextDouble();

        Convertor amount = new Convertor(rubles);
        System.out.println("You have: " + amount.toUSD() + " dollars!");
        System.out.println("You have: " + amount.toEUR() + " euros!");

        }
    }

