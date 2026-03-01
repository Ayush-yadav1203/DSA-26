import java.util.*;
public class reverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        Integer[][] arr = new Integer[n][m];

        // Input
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                arr[i][j] = sc.nextInt();
            }
        }
        for(int i=0;i<n;i++){
            Collections.reverse(Arrays.asList(arr[i]));
        }
        for(Integer[] row : arr){
            System.out.println(Arrays.toString(row));
        }
    }
}
