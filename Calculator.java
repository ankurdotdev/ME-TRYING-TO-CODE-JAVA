import java.util.*;
public class Calculator{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1st number--> ");
        double n1 = sc.nextDouble();

        System.out.print("Enter 2nd number--> ");
        double n2 = sc.nextDouble();
       
        System.out.print("Choose Operator '+,-,*,/,%'--> ");
        char operator  = sc.next().charAt(0);
        
        double result;
        switch(operator){

            case '+':
                result = n1+n2;
                System.out.println("Addition of "+ n1 +" & " + n2 + " is " + result);
                break;
            case '-':
                result = n1-n2;
                System.out.println("Substraction of "+ n1 +" & " + n2 + " is " + result);
                break;
            case '*':
                result = n1*n2;
                System.out.println("Multiplication of "+ n1 +" & " + n2 + " is " + result);
                break;
            case '/':
                result = n1/n2;
                System.out.println("Division of "+ n1 +" & " + n2 + " is " + result);
                break;
            case '%':
                result = n1%n2;
                System.out.println("Reminder of "+ n1 +" & " + n2 + " is " + result);
                break;
            default:             
            System.out.println("operator is wrong ");    

        }
    }
}