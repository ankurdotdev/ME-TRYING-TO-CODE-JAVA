import java.util.Scanner;
public class Array4{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of the array--> ");
        int size = sc.nextInt();
        int[] arr = new int[size];

        System.out.println("Enter array data--> ");


        for(int i =0;i<arr.length;i++){ // input
            arr[i] = sc.nextInt();
        }

        int total = arr.length;
    
        double sum = 0;

        for(int i = 0;i<arr.length;i++){
            sum +=arr[i];
        }
        double avg =  sum/total;
        System.out.println(avg);
    }
}