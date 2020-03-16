package buoi1;

import java.util.Scanner;

public class Practice4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("this is a program converting a decimal number to binary number");
        System.out.print("Input the number: ");
        int n = sc.nextInt();
        System.out.println("the output is: "+cvert(n));
    }
    public static String cvert(int n){
        int a= 0;
        String bin="";
        if(n==0){
            return "0";
        }else{
        while (n>0){
            a =n%2;
            n=n/2;
            bin=bin+a;
        }
            return bin;
        }
    }
}
