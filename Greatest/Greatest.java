import java.util.Scanner;
public class Greatest{
    public static void main(String [] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the three Number :");
         int a,b,c;
         a=sc.nextInt();
         b=sc.nextInt();
         c=sc.nextInt();

         if(a>b && a>c)
         {
            System.out.println("the greater number is "+a);
         }
         else if(b>a && b>c)
         {
            System.out.println("the greater number is "+b);
         }
         else
         {
            System.out.println("the greater number is "+c);
         }
    }
}