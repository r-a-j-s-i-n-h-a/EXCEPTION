import java.util.InputMismatchException;
import java.util.Scanner;
public class Test10 {
    public static void main(String[] args) {

        Scanner sc =new Scanner(System.in);

        //Arithmetic Exception
        try {
            int a=sc.nextInt();
            int b=sc.nextInt();
            int arr[]={12,34,56,78,90};
            int index = sc.nextInt();

            System.out.println(a/b);
            System.out.println(arr[index]);
        }
        catch(ArrayIndexOutOfBoundsException | ArithmeticException| InputMismatchException obj)
        {
            System.out.println(obj);
        }
        //catch(ArithmeticException obj)
        //{
        //    System.out.println(obj);
        //}
        //System.out.println("end of program");

    }
}
