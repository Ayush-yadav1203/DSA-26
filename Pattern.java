import java.util.*;
public class Pattern {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        System.out.println("------------------");
        // pattern1(n);System.out.println();
        // pattern2(n);System.out.println();
        // pattern3(n);System.out.println();
        // pattern4(n);System.out.println();
        // pattern5(n);System.out.println();
        // pattern6(n);System.out.println();
        // pattern7(n);System.out.println();
        // pattern8(n);System.out.println();
        // pattern9(n);System.out.println();
        // pattern10(n);System.out.println();
        // pattern11(n);System.out.println();
        // pattern12(n);System.out.println();
        // pattern13(n);System.out.println();
        pattern14(n);System.out.println();
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
    static void pattern8(int n){
        for(int row=0;row<n;row++){
            for(int col=0;col<n-row;col++){
                System.out.print(" ");
            }
            for(int col=0;col<=2*row;col++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    static void pattern9(int n){
        for(int row=n;row>=1;row--){
            for(int col=1;col<=n-row;col++){
                System.out.print(" ");
            }
            for(int col=1;col<=2*row-1;col++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    static void pattern10(int n){
        for(int row=1;row<=n;row++){
            for(int col=1;col<=n-row;col++){
                System.out.print(" ");
            }
            for(int col=1;col<=row;col++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    static void pattern11(int n){
        for(int row=n;row>=1;row--){
            for(int col=1;col<=n-row;col++){
                System.out.print(" ");
            }
            for(int col=1;col<=row;col++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    static void pattern12(int n){
        for(int row=n;row>=1;row--){
            for(int col=1;col<=n-row;col++){
                System.out.print(" ");
            }
            for(int col=1;col<=row;col++){
                System.out.print("* ");
            }
            System.out.println();
        }
        for(int row=1;row<=n;row++){
            for(int col=1;col<=n-row;col++){
                System.out.print(" ");
            }
            for(int col=1;col<=row;col++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    static void pattern13(int n){
        for(int row=1;row<=n;row++){
            for(int col=1;col<=n-row;col++){
                System.out.print(" ");
            }
            for(int col=1;col<=2*row-1;col++){
                if(col==1||col==2*row-1||row==n){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    static void pattern14(int n){
        for(int row=n;row>=1;row--){
            for(int col=1;col<=n-row;col++){
                System.out.print(" ");
            }
            for(int col=1;col<=2*row-1;col++){
                if(col==1||col==2*row-1||row==n){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}