package pr210;

import java.util.Objects;
import java.util.Scanner;

public class HowMany {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();

        int count = 1;

        for(int i = 0; i < text.length(); i++)
        {
            char c = text.charAt(i);

            if(Objects.equals(c, ' '))
                count++;
        }

        System.out.println(count);
    }

}

