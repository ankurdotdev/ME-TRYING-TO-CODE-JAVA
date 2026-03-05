public class Array5 {
    public static void main(String[] args) {
        int[] a = {12,23,4,56,7,8};
        int even =0;
        int odd = 0;

        for(int i =0;i<a.length;i++){
            if(a[i]%2==0) even++;
          
            else odd++;
        }
        System.out.println("Even count--> "+even);
        System.out.println("Odd count--> "+odd);
    }
}
