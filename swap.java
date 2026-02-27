import java.util.*;
public class swap {
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        System.out.println("Enter length of array");
        int n=in.nextInt();
        int[] array=new int[n];
        for(int i=0;i<n;i++){
            array[i] =in.nextInt();
        }
        
        System.out.println("Enter first index1 : ");
        int b=in.nextInt();
        System.out.println("Enter the index2 : ");
        int a=in.nextInt();
        swap(array, b,a);
    
    }
    static void swap(int[] array,int b,int a){
        int temp=array[b];
        array[b]=array[a];
        array[a]=temp;
        System.out.println("Array after swapping : ");
        for(int num:array){
            System.out.println(num + " ");
        }

    }
    
}
