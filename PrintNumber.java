import java.util.*;
public class PrintNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 1;i<=n;i++){
            System.out.println(i);
        }
        System.out.println();

        System.out.println("reverse print");
        for(int i=n;i>0;i--){
            System.out.println(i);

        }
    }
}
