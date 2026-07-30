package recursion;
import java.util.*;
public class eleonce {
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the Length");
        int n=in.nextInt();
        System.out.println("Enter array :--------");
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=in.nextInt();
        }
        System.out.println(present(arr));
    }
    static int present(int[] num){
        int unique=0;
        for(int n:num){
            unique^=n;
        }
        return unique;
    }
}
