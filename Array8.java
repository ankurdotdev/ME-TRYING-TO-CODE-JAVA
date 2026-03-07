// Find the Index of an Element

public class Array8 {
    public static void main(String[] args) {
        int[] a = {1,2,4,3,4};
        int target = 4;

        for(int i =0;i<a.length;i++){
            if(a[i] == target){
                System.out.println("Target found at  index--> "+i);
            }

        }
    }
}
