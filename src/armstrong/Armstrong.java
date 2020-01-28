package armstrong;

import java.util.Scanner;

/**
 *
 * @author Jenisha Munikar
 */
public class Armstrong {

    public static void main(String[] args) {
       
       int n,count=0,a,result = 0,rem=0;
       Scanner s=new Scanner(System.in);
       System.out.println("Enter the number:");
       n=s.nextInt();
       a=n;
       
       while(n!=0)  //for  counting no of digits in the given number
       {
           n=n/10;
           count++;
       }

       n=a;

       while(a!=0)
       {
           rem=a%10;
           result=(int) (Math.pow(rem,count)+result);
           a=a/10;
       }
       
       if(n==result)
       {
            System.out.println(n+" is armstrong number");
       }
       else{
            System.out.println(n+" is not armstrong number");
       }
           
    }
    
}
