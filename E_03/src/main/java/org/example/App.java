package org.example;

import java.util.Scanner;
/**
 * Use a single output statement to produce this output, using appropriate string-escaping techniques for quotes.
 * If your language supports string interpolation or string substitution, don’t use it for this exercise. Use string concatenation instead.
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Scanner reader = new Scanner(System.in);
        System.out.print( "What is the quote? " );
        String quote = reader.nextLine();

        System.out.print("Who said it? ");
        String stater = reader.nextLine();
        System.out.println(stater + " says, \"" + quote + "\"");


    }
}
