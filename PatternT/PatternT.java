import java.util.Scanner;

public class PatternT {
    public static void main(String []args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the row");
        int n=sc.nextInt();
        for(int i=0;i<=n;i++)
        {
            for(int j=n;j>i;j--)
            {
                System.out.print(" ");
            }
            int num=0;
            for(int k=1;k<=i;k++)
                {
                    System.out.print(k);
                    num=k-1;
                }
                while(num!=0)
                {
                    System.out.print(num--);
                }
            System.out.println();
        }
    }
}
