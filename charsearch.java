import java.util.*;
public class charsearch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String name=in.next();
        char s=in.next().charAt(0);
        System.out.print(Search(name,s));
    }
    static boolean Search(String name,char s){
        name=name.toLowerCase();
        s=Character.toLowerCase(s);
        if(name.length()==0) return false;
        for(int i=0;i<name.length();i++){
            if(s==name.charAt(i)){
                System.out.println("index : "+i);
                
                return true;
            }
            
        } 
        System.out.println("index not found");
        return false;

    }
}
