import java.util.*;
public class Pattern {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        pattern1(n);System.out.println();
        pattern2(n);System.out.println();
        pattern3(n);System.out.println();
        pattern4(n);System.out.println();
        pattern5(n);System.out.println();
        pattern6(n);System.out.println();
        pattern7(n);System.out.println();
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
            for(int col=1;col<=n;col++){
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
    static void pattern3(int n){
        for(int row=0;row<n;row++){
            for(int col=0;col<n-row;col++){
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
    static void pattern4(int n){
        for(int row=1;row<=n;row++){
            for(int col=1;col<=row;col++){
                System.out.print(col +" ");
            }
            System.out.println();
        }
    }
    static void pattern5(int n){
        for(int row=0;row<2*n;row++){
            int c=row>n?2*n-row:row;
            for(int col=0;col<c;col++){
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
    static void pattern6(int n){
        for(int row = 1; row <= n; row++){

            for(int col = 1; col <= n - row; col++){
                System.out.print("  ");
            }

            for(int i = 1; i <= row; i++){
                System.out.print(" *");
            }

            System.out.println();
        }
    }
    static void pattern7(int n){
        for(int row=n;row>=1;row--){
            for(int col=1;col<=n-row;col++){
                System.out.print(" ");
            }
            for(int i=1;i<=row;i++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    
}