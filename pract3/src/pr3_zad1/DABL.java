package pr3_zad1;

public class DABL
{
    public static void main(String[] args)
    {
        double a = 20.25;
        Double c = Double.valueOf("111.2");
        System.out.println(c);

        String s = "100.22225";
        c = Double.parseDouble(s);
        System.out.println(c);

        c = 105.22255;
        byte b = c.byteValue();
        System.out.println("Byte value: " + b);

        short sh = c.shortValue();
        System.out.println("Short value: " + sh);

        int i = c.intValue();
        System.out.println("Integer value: " + i);

        long l = c.longValue();
        System.out.println("Long value: " + l);

        float f = c.floatValue();
        System.out.println("Float value: " + f);

        Double j = Double.valueOf(Double.toString(3.14));
        System.out.println(j);
    }
}



