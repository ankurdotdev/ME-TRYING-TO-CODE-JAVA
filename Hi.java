import java.util.*;

class HiAnkur{
    public static void main(String[] args) {
        System.out.println("HI THIS IS MY FIRST COMMIT OF 2026!");

        Scanner i = new Scanner(System.in);
        int a = i.nextInt();
        System.out.println(a);

        main(new int[]{1,2,3});   // ✔ correct way
    }

    public static void main(int[] a){
        System.out.println("overloading");
    }
}