import java.io.*;
import java.util.*;

public class PowerLog {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner scn = new Scanner(System.in);
        int x = scn.nextInt();
        int n = scn.nextInt();
        int xn = power(x, n);
        System.out.println(xn);
    }

    public static int power(int x, int n){
        if(n == 0){
            return 1;
        }
        
        int xpnb2 = power(x, n/2);
        int xn = xpnb2*xpnb2;
        
        if(n % 2 == 1){
            xn = x * xn;
        }
        
        return xn;
    }

}

// import java.io.*;
// import java.util.*;

// public class PowerLog {
//     public static Scanner scn = new Scanner(System.in);
//     public static void main(String[] args) {
//         int x = scn.nextInt();
//         int n = scn.nextInt();
//         int xn = powerBtr(x, n);
//         System.out.print(xn);
//     }

//     public static int powerBtr(int x, int n) {
//         if (n == 0)
//             return 1;

//         int recAns = powerBtr(x, n / 2);
//         recAns *= recAns;

//         return n % 2 == 0 ? recAns : recAns * x;
//     }
// }