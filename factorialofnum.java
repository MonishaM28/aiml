import java.util.Scanner;
public class Factorialofnum  {
    public static void main(String[] args)  {
        int number;
        long fact=1;
        System.out.println("enter any non zero positive integer number...");
        Scanner Sc = new Scanner(System.in);
        number=Integer.parseInt(Sc.next());
        for(int i=number ; i > 0 ; i--)
        fact = fact * i;
        System.out.println("the factorial of given number"+number+" is "+fact);
        Sc.close();
    }
}