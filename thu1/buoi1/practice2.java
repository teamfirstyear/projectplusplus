package buoi1;

import java.util.Scanner;

public class practice2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Input the first number: ");
        int first=sc.nextInt();
        System.out.print("Input the second number: ");
        int second =sc.nextInt();
        System.out.println("Output:");
        System.out.println(first+"+"+second+"="+(first+second));
        System.out.println(first+"-"+second+"="+(first-second));
        System.out.println(first+"x"+second+"="+(first*second));
        System.out.println(first+":"+second+"="+(first/second));
        System.out.println(first+"mod"+second+"="+(first % second));

    }
}
