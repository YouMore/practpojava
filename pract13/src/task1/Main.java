package task1;

public class Main {

    public static void test(String str)
    {
        System.out.println("Строка: " + str);
        System.out.println("Последний символ строки: " + str.charAt(str.length() - 1));
        System.out.println("Заканчивается ли строка подстрокой \"!!!\" :" + str.endsWith("!!!") );
        System.out.println("Начинается ли строка подстрокой \"I like\" :" + str.startsWith("Java") );
        System.out.println("Содержит ли строка подстроку \"Java\" :" + str.contains("life") );
        System.out.println("Поиск позиции: " + str.indexOf("our"));
        System.out.println("Замена всех a на o: " + str.replace('a', 'o'));
        System.out.println("Преобразование строки к верхнему регистру: " + str.toUpperCase());
        System.out.println("Преобразование строки к нижнему регистру: " + str.toLowerCase());
        System.out.println("Вырезание подстроки: " + str.substring(7, 11));
    }

    public static void main(String[] args) {
        test("Java is our life!!!");
    }
}