// Sum of even and odd numbers in an array
public class Array6 {
    public static void main(String[] args) {
        int[] a = {1,2,3,4,5,6,7,8,9,1,8,7,5,2,3,5};

        int EvenSum = 0;
        int OddSum = 0;

        for(int i : a){ // for each loop

                if(i%2 == 0){
                    EvenSum += i;
                }
                else{
                    OddSum += i;
                }
        }
        
        System.out.println("Sum of even number--> "+EvenSum);
        System.out.println("Sum of odd number--> "+OddSum);

    }
}
