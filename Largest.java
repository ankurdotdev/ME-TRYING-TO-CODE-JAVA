import java.util.*;
public class Largest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();

        if(n1>n2){
            System.out.println(n1 +" is greater");
        }else if(n1==n2){
            System.out.println(n1 +" & " + n2 + " is equal");
        }else{
            System.out.println(n2 + " is greater");
        }
    }
    
}
