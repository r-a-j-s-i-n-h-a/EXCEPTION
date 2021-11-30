/*
Get the input String from user and parse it to integer, if it is not a number it will throw number
format exception Catch it and print "Entered input is not a valid format for an integer." or else print
the square of that number.
*/

import java.util.InputMismatchException;
import java.util.Scanner;

public class Test_Exceptional {

    public static void main(String[] args) {

        try{
            Scanner sc= new Scanner(System.in);
            int a=sc.nextInt();
            System.out.println(a*a);
            System.out.println("The work has been done successfully");

        } catch (InputMismatchException e) {
            System.out.println(e);
            System.out.println("entered input is not valid format for an integer");
        }

    }

}
