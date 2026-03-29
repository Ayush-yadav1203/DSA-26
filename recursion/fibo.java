package recursion;
import java.util.*;
public class fibo {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        System.out.println("-------------------------");
        System.out.println(fibbo(n));
    }
    static int fibbo(int n){
        if(n<2) return n;
        return fibbo(n-1)+fibbo(n-2);
    }
}
