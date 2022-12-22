package pr3_4;

import java.util.Arrays;
import java.util.Scanner;

public class Array
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");

        int n = 0;

        while (n <= 1)
        {
            if(scan.hasNextInt())
            {
                n = scan.nextInt();

                if(n <= 1)
                {
                    System.out.println("The size of the array must be greater than 1!");
                }
            }

            else
            {
                System.out.println("Enter an integer number!");
                scan.next();
            }
        }

        int[] array = new int[n];

        int newN = 0;

        for (int i = 0; i < n; i++)
        {
            array[i] = (int)(Math.random() * (n));

            if(array[i] % 2 == 0)
            {
                newN++;
            }
        }

        System.out.println(Arrays.toString(array));

        int[] array2 = new int[newN];
        int j = 0;

        for (int i = 0; i < n; i++)
        {
            if (array[i] % 2 == 0)
            {
                array2[j] = array[i];
                j++;
            }

        }

        System.out.println(Arrays.toString(array2));
    }
}

