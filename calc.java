import java.util.*;
public class calc {
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        System.out.println("Enter first integer ");
        double a=in.nextDouble();
        System.out.println("Enter second integer");
        double b=in.nextDouble();
        System.out.println("Enter operator ");
        char op=in.next().trim().charAt(0);
        double result =0;
        if(op=='+'){
            result=a+b;
        }
        else if(op=='-'){
            result=a-b;
        }
        else if(op=='*'){
            result=a*b;
        }
        else if(op=='/'){
            if(b!=0){
                System.out.println("Can't divide by zero");
                return ;
            }
            else{
                result=a/b;
            }
            
        }
        else {
            System.out.println("Invalid Operator");
            return ;
        }
        System.out.println("Result "+ result);
    }
}
