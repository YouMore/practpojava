package pr2;

import java.lang.*;
import java.sql.SQLOutput;
import java.util.Scanner;

public class TestAuthor
{
    public static void main(String[] args)
    {
        String email;

        Author author = new Author("Aidar", "AAT@gmail.com", 'M');

        System.out.println("Author's name: " + author.getName());


        System.out.println("Author's email: " + author.getEmail());


        Scanner scan = new Scanner(System.in);
        System.out.print("New author's email: ");
        email = scan.nextLine();

        author.setEmail(email);

        System.out.println("\nAuthor's gender: " + author.getGender());

        System.out.println(author);
    }
}

