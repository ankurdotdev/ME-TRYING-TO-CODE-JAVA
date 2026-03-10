 //product of even and odd number in array
public class Array11 {
    public static void main(String[] args) {
        int[] arr = {0,1,2,0,3,4,5,6,7,8,9,2};
        int EvenProduct = 1;
        int OddProduct = 1;

        for(int i =0;i<arr.length;i++){

            if(arr[i] == 0){
                continue;
            }
            
            if(arr[i]%2==0){
            
                EvenProduct *= arr[i];
            }
            else{

                OddProduct *= arr[i];
            } 
        }
        System.out.println("Product of even numbers---> "+EvenProduct);
        System.out.println("Product of odd numbers---> "+OddProduct);

    }
}
