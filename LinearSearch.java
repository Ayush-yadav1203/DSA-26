import java.util.*;
public class LinearSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[]arr = new int[n];
        // Input
        for(int i = 0; i < n; i++){  
            arr[i]= sc.nextInt();
        }
        int target = sc.nextInt();
        int ans =linearsearch(arr,target);
        if(ans != -1){
            System.out.println("Element found at index: " + ans);
        } else {
            System.out.println("Element not found");
        }
    }
    public static int linearsearch(int[] arr, int target){
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == target){
                return i;   // return index
            }
        }
        return -1;
    }
}
