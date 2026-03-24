import java.util.*;
public class recc {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int m=in.nextInt();
        System.out.println("------------------------------");
        print(m);
    }
    static void print(int n ){
        if(n==10){
            System.out.println(10);
            return;
        }
        System.out.println(n);
        print(n+1);
    }
}
