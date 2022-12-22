package pr3_3;

public class Massiv
{
    public static void main(String [] args)
    {
        int[] array = new int[4];

        System.out.println("Your array: ");
        for (int i = 0; i < array.length; i++)
        {
            array[i] = (int) ((Math.random() * 99) + 10);
            System.out.print(array[i] + " ");
        }

        for (int i = 0; i < array.length; i++)
        {
            if(i > 0)
            {
                if (array[i-1] >= array[i])
                {
                    System.out.println("\nNot an increasing progression!");
                    break;
                }
            }

            if (i == array.length - 1)
            {
                System.out.println("\nAn increasing progression!");
            }
        }
    }

}

