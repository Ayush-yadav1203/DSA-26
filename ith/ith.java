package ith;
import java.util.*;
public class ith {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter number");
        int num = in.nextInt();   
        System.out.println("Enter bit");
        int i = in.nextInt();

        // Find
        System.out.println("Bit = " + ((num >> i) & 1));

        // Set
        System.out.println("Set = " + (num | (1 << i)));

        // Reset
        System.out.println("Reset = " + (num & ~(1 << i)));

        // Toggle
        System.out.println("Toggle = " + (num ^ (1 << i)));
    }
}
