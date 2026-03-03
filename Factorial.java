import java.util.*;
public class Factorial{
    public static void main(String[] args){
       Scanner sc = new Scanner(System.in);
       System.out.print("Enter the number you want the factorial of --> ");
        int n = sc.nextInt();
        int f = 1;
        for(int i =n;i>=1;i--){                       //for(int i =1;i<=n;i++)
            f= f*i;                                      // f= f*i;    
        }
        System.out.print("Factorial of " + n + " is --> ");
        System.out.println(f);
    }
}
