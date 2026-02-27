import java.util.*;
public class countocc {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        int n=in.nextInt();
        System.out.print("Enter Digit");
        int digit=in.nextInt();
        int count=0;
        while(n>0){
            int rem=n%10;
            if(rem==digit){
                count++;
            }
            n=n/10;
        }
        System.out.println("occurence : "+ count);
    }
}
