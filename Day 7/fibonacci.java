// package Day_7;

import java.util.Scanner;

public class fibonacci {
    static int n1=0,n2=1,n3=0;
    static void fibonacci1(int n) {
        if(n>0) {
            n3=n1+n2;
            n1=n2;
            n2=n3;
            System.out.print(" "+n3);
            fibonacci1(n-1);
        }
    }
    public static void main(String[] args) {
        // fibonacci ob=new fibonacci();
        Scanner input=new Scanner(System.in);
        System.out.print("Enter a No.: ");
        int n=input.nextInt();
        System.out.print(n1+" "+n2);
        fibonacci1(n-2);
        input.close();
    }
}
