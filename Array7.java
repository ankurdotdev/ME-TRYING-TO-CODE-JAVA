public class Array7{
    public static void main(String[] args){
        int[] arr = {0,2,4,5,0,-8,-7,-7};
        int p = 0;
        int n = 0;
        int z = 0;
        for(int i =0;i<arr.length;i++){
            
            if(arr[i] > 0 ){
                System.out.println(arr[i]+" is Positive");
                p++;
            }
 
            else if(arr[i] == 0 ){
                System.out.println(arr[i]+" is Zero");
                z++;
            }
            
            else{
                System.out.println(arr[i]+" is Negative");
                n++;
            }
        }

        System.out.println(" ");

        System.out.println("Total Positive--> "+ p);
        System.out.println("Total Negative--> "+ n);
        System.out.println("Total zero--> "+ z);
    }
}