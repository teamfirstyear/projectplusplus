package buoi1;

import java.util.Scanner;

public class practice3 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("input the number: ");
        int a=sc.nextInt();
        for(int i=1;i<=10;i+=1){
            System.out.println(a+"x"+i+"="+(a*i));
        }
    }
}
