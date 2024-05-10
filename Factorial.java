import java.util.*;
public class Factorial{
    public static Scanner scn = new Scanner(System.in); 
    public static int printFactorial(int n){
        if(n == 1)
        return 1;

        int recAns = printFactorial(n-1);
        return recAns * n;
    }

public static void main(String[] args){
        int n = scn.nextInt();
        
        System.out.println(printFactorial(n));
}

}