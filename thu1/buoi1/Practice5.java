package buoi1;

import java.util.Scanner;

public class Practice5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input the number you want: ");
        int a = sc.nextInt();
        String cal = "" + a;
        int num1= Integer.valueOf(cal+cal);
        int num2= Integer.valueOf(cal+cal+cal);
        System.out.print(a+"+"+num1+"+"+num2+"="+(a+num1+num2));
    }


}
