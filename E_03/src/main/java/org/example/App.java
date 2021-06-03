package org.example;

import java.util.Scanner;
/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solutions
 *  Copyright 2021 Keivn Kant
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
