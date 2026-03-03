/* 
Problem 1 -->

Given an integer num, return the number of steps required to reduce it to 0.

Rules:
- If num is even → divide by 2
- If num is odd → subtract 1

Repeat until num becomes 0 and count total steps.
*/


import java.util.*;
public class Problem1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number --> ");
        int n = sc.nextInt();
        int steps = 0;

        while(n!=0){
            if(n%2 == 0) n = n/2;
            else n=n-1;
            steps++;
        }
         System.out.print("Total steps --> "+ steps);
    }
}
