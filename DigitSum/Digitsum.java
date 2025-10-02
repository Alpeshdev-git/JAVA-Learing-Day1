
import java.util.Scanner;

public class Digitsum {
     public static void main(String []args)
     {
        Scanner sc=new Scanner(System.in);
        int n;
        System.out.println("Enter the number ");
        n=sc.nextInt();
        int num=n;
        boolean flag=false;
        int sum=0;
        while(flag!=true)
        {
            sum=0;
             while(num!=0)
                {
                int number=num%10;
                sum+=number;
                num=num/10;
                }
                if(sum<10)
                {
                    flag=true;
                }
                else
                {
                    num=sum;
                }
        }
        System.out.println("the sum is "+sum);
        
     }
}
