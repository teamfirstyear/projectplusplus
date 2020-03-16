package buoi2;

import java.util.Scanner;

public class Practice1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input the first num: ");
        int num1= sc.nextInt();
        System.out.print("Input the second num: ");
        int num2=sc.nextInt();
        System.out.println("Output: "+f(num1,num2));

    }
    public static int f(int a, int b ){
        return a*b;
    }
}
