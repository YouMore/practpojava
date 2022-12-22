package lab6_3;

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        Person p1 =new Person("Aidar");
        Person p2 =new Person("Kirill");
        Pet pet1 = new Pet("PSINA");
        Pet pet2 = new Pet("SOBAKA");

        Nameable[] names = {p1,p2,pet1,pet2};
        for(Nameable name: names)
        {
            System.out.println(name);
        }
    }
}
