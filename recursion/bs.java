package recursion;
import java.util.*;
public class bs {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the length of the array");
        int n=in.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter array");
        for(int i=0;i<n;i++){
            arr[i]=in.nextInt();
        }
        System.out.println("enter target");
        int target=in.nextInt();
        System.out.println("-------------------------");
        System.out.println(search(arr,target,0,arr.length-1));
    }
    static int search(int[] arr,int target,int s,int e){
        if(s>e) return -1;
        int m=s+(e-s)/2;
        if(arr[m]==target) {
            System.out.print("Target at index :  ");
            return m;
        }
        if(target<arr[m] ){
            return search(arr, target, s, m-1);
        }
        else{
            return search(arr, target, m+1, e);
        }
    }
}
