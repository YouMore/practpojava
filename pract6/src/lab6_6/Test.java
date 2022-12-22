package lab6_6;

public class Test {
    public static void main(String[] args) {
        Book b1 = new Book("GARRY POTTER");
        Book b2 = new Book("GARRY POTTER 2");
        Shop sh1 = new Shop("shop1");
        Shop sh2 = new Shop("shop2");

        Printable[] printables ={b1,b2,sh1,sh2};

        for(Printable printable:printables){
            printable.print();
        }
    }
}
