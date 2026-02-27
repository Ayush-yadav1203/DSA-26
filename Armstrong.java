import java.util.*;
public class Armstrong {
    public static void main(String[] args) {
        Scanner  in =new Scanner(System.in);
        int n=in.nextInt();
        boolean ans=isArmstrong(n);
        System.out.println(ans);
    }
    static boolean isArmstrong(int n){
        int original=n;
        int add=0;  
        int digit=String.valueOf(n).length();
        while(n>0){
            int rem =n%10;
            add+=Math.pow(rem,digit);
            n=n/10;
        }
        return add==original;
    }
}
