import java.util.*;
public class Power{
    public static Scanner scn = new Scanner(System.in); 
    public static int power(int a,int b){
        if(b == 0)
        return 1;

        int ans = power(a,b-1);
        return ans * a;
    }

public static void main(String[] args){
        int a = scn.nextInt();
        int b = scn.nextInt();
        
        System.out.println(power(a,b));
}

}