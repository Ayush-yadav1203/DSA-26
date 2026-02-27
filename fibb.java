// import java.util.*;

// public class fibb {
//     public static void main(String[] args) {
//         Scanner st = new Scanner(System.in);
//         int n = st.nextInt();

//         int a = 0, b = 1;

//         if (n >= 1) {
//             System.out.println(a);
//         }
//         if (n >= 2) {
//             System.out.println(b);
//         }

//         for (int i = 3; i <= n; i++) {
//             int c = a + b;
//             System.out.println(c);
//             a = b;
//             b = c;
//         }
//     }
// }

import java.util.*;

public class fibb {
    public static void main(String[] args) {
        Scanner st = new Scanner(System.in);
        int n = st.nextInt();

        int a = 0, b = 1;
        int count = 1;

        while (count <= n) {
            System.out.println(a);
            int next = a + b;
            a = b;
            b = next;
            count++;
        }
    }
}