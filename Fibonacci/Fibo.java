import java.util.Scanner;

public class Fibo {
    public static void main(String []args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number ");
        int n;
        n=sc.nextInt();
        ;

        int fibo=0;
        for(int i=1;i<n;i++)
        {
           System.out.print(fibo+" ");
           fibo=fibo+i;
        }
     
    }
}
