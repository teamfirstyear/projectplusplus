package buoi2;

import java.util.Scanner;

public class Practice2 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Input fibonacci lenght: ");
        int lenght=sc.nextInt();
        System.out.println("Output:");
        for (int i=1;i<lenght;i++){
            System.out.print(fib(i)+", ");
        }
        System.out.print(fib(lenght)+". ");
    }
    public static int fib(int a){
        if(a==1){
            return 0;
        } else if (a==2){
            return 1;
        }else{
            return fib(a-1)+fib(a-2);
        }
    }
}
