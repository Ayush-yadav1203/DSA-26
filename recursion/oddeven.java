package recursion;
import java.util.*;
public class oddeven {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the Digit");
        int n=in.nextInt();
        System.out.println(isOdd(n));
    }
    static boolean isOdd(int n){
        return (n&1)==1;
        //even ==0
    }
}
