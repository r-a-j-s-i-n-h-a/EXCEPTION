import java.util.Scanner;

public class handle {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String a=sc.nextLine();
        int b;
        try{
            b=Integer.parseInt(a);
            System.out.println("product is "+b*b);
        }
        catch(NumberFormatException e){
            System.out.println(e);
        }
    }
