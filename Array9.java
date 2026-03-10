//Sorting an array
public class Array9 {
    public static void main(String[] args){
        int[] a = {8,9,5,7,1,2,3,6,4};
    

        for(int i =0;i< a.length-1;i++){
            for(int j =i+1;j< a.length;j++){
                if(a[i]>a[j]){
                    int temp=a[i];
                    a[i] = a[j];
                    a[j]=temp;
                }
            }
            
        }
        for(int i = 0;i<a.length;i++){
            System.out.print(a[i]+ " ");
        }

        
    }
}
