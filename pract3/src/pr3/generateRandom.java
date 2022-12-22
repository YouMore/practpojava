package pr3;

import java.util.Random;
import java.util.Arrays;

public class generateRandom
{
    public static void main(String[] args)
    {
        System.out.println("Array of random numbers with class Random:");

        Random rand = new Random();

        double[] arr1 = new double[10];

        for(int i = 0; i < 10; i++)
        {
            arr1[i] = rand.nextDouble();

            System.out.print(arr1[i] + " ");
        }

        Arrays.sort(arr1);

        System.out.println("\n");

        for(int i = 0; i < 10; i++)
        {
            System.out.print(arr1[i] + " ");
        }

        System.out.println("\nArray of random numbers with metod random:");

        double[] arr2 = new double[10];

        for(int i = 0; i < 10; i++)
        {
            arr2[i] = Math.random();

            System.out.print(arr2[i] + " ");
        }

        Arrays.sort(arr2);

        System.out.println("\n");

        for(int i = 0; i < 10; i++)
        {
            System.out.print(arr2[i] + " ");
        }
    }
}

