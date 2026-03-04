// Sum of all elements in an array
import java.util.*;
public class Array3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of an array: ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        int sum = 0;

        System.out.println("Enter elements: ");
        for(int i = 0;i<arr.length;i++){
            arr[i] = sc.nextInt();  
        }

        for(int i =0;i<arr.length;i++){
            sum +=arr[i];
        }
        System.out.println("TotalSum: "+ sum);
    }
}
