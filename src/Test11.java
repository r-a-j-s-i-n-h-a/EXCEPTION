public class Test11 {
    public static void main(String[] args) {
        try
        {
            throw new ArithmeticException("/ by zero");

        }
        catch(ArithmeticException obj)
        {
            System.out.println(obj);
        }
    }
}
