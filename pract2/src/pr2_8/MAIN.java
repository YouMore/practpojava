package pr2_8;

import java.util.Scanner;

public class MAIN {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size;

        System.out.println("Input size of array:");
        size = scanner.nextInt();

        String[] mas = new String[size];

        for(int i = 0; i < size; i++)
        {
            System.out.println("Input string:");
            mas[i] = scanner.next();
        }

        String time;

        for(int i = 0; i < size/2; i++)
        {
            time = mas[size - i - 1];
            mas[size - i - 1] = mas[i];
            mas[i] = time;
        }

        for(int i = 0; i < size; i++)
            System.out.println(mas[i]);
    }
}
