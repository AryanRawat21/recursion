import java.util.*;
public class PrintIncreasingDecreasing{
    public static Scanner scn = new Scanner(System.in); 
    public static void printIncreasingDecreasing(int a,int b){
        if(a>b)
        return;
        System.out.println(a);
        printIncreasingDecreasing(a+1, b);
        System.out.println(a);
    }

public static void main(String[] args){
        int a =scn.nextInt();
        int b = scn.nextInt();
        printIncreasingDecreasing(a,b);
}

}
