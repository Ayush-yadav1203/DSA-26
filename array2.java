import java.util.*;
public class array2 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter size of row : ");
        int n=in.nextInt();
        System.out.println("Enter size of column  : ");
        int m=in.nextInt();
        int[][] array =new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                array[i][j]=in.nextInt();
            }
        }
        for(int a[]:array){
            System.out.println(Arrays.toString(a));
        }

    }
}
