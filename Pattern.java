import java.util.*;
public class Pattern {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        pattern1(n);
    }
    static void pattern1(int n){
        for(int row=1;row<=n;row++){
            for(int col=1;col<=row;col++){
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
    static void pattern2(int n){
        for(int row=1;row<=n;row++){
            for(int col=1;col<=row;col++){
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
}
