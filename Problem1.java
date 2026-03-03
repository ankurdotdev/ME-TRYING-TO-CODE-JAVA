import java.util.*;
public class Problem1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number --> ");
        int n = sc.nextInt();
        int steps = 0;

        while(n!=0){
            if(n%2 == 0) n = n/2;
            else n=n-1;
            steps++;
        }
         System.out.print("Total steps --> "+ steps);
    }
}
