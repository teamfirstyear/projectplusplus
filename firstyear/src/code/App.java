package code;


import code.ob.Execute;

import java.util.Scanner;


public class App {
    public static void main(String[] args)  {
        Execute ex = new Execute();
        Scanner sc =new Scanner(System.in);
        String result="";
        do{
            ex.hienthi();
            System.out.println("Bạn có chắc muốn thoát không(y/n)?");
            result=sc.nextLine();
        }while(result.equals("n"));
        System.out.println("Tạm biệt!");

    }
}
