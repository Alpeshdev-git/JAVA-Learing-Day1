import java.util.Scanner;

public class Grade {
     public static void main(String []args)
     {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the Grade of Student ");
        int n=sc.nextInt();
        if(n>=90)
        {
            System.out.println("the grade is Excellent");
        }
        else if(n<90 && n>=80)
        {
               System.out.println("the grade is veryGood");
        }
        else if(n<80 && n>=70)
        {
                 System.out.println("the grade is Good");
        }
        else if(n<70 && n>=60)
        {
                System.out.println("the grade is Average");
        }
        else if(n<60 && n>=40)
        {
                 System.out.println("the grade is pass");
        }
        else
        {
                  System.out.println("the grade is fail");
        }
     }
}
