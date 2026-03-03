// Input and Output in an array
import java.util.*;
public class Array1 {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.print("Enter size >> ");
       int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter number in array->> ");

        // input
        for(int i=0;i<size;i++){
            arr[i] = sc.nextInt();
        }

        //output
        System.out.println("entered numbers>> ");
        for(int i=0;i<size;i++){
            System.out.println(arr[i]);
        }
    }
}
