package buoi1;

import java.util.Scanner;

public class Practice7 {
    public static void main(String[]args){
        Scanner sc =new Scanner(System.in);
        System.out.print("Input the number of pyramid's layer: ");
        int a = sc.nextInt();
        int b = 2*(a-1)+1;
        int c =b/2;
        for (int i=1;i<=b;i+=2){
            for (int k= 0;k<(c-i/2);k++){
                System.out.print(" ");
            }
            for (int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
}


