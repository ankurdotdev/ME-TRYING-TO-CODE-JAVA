//product of all elements in an array
public class Array10 {
    public static void main(String[] args) {
        int[] a = {1,2,3,4,8,7,9,5,6};
        int p = 1;

        for(int i = 0; i < a.length; i++){
            p *=a[i];
        }
        System.out.println("Product of all elements---> "+p);
    } 
}
