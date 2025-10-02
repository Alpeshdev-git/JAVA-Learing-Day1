import java.util.Scanner;
public class Oddeven{
    public static void main(String [] args)
    {
        Scanner sc=new Scanner(System.in);
         int n;
       System.out.println("Enter the number to be check :");
        n=sc.nextInt();
        if(n%2==0)
        {
            System.out.println(n+" is even ");
        }
        else
        {
            System.out.println(n+" is odd");
        }
    }
}