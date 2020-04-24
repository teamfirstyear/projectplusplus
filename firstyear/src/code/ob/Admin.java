package code.ob;


import code.func.WorkWithList;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.List;
import java.util.Scanner;

public class Admin extends WorkWithList {
    private String username;
    private static final String passwordAdmin ="teamfirstyear";
    private Scanner sc=new Scanner(System.in);

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }


    public Admin()  {
        AdminWork();
    }
    public void AdminWork()  {
        System.out.println("Chào teamfirstyear! ");
        int choice=0;
        do {
            System.out.println("Nhập 1 để nạp dữ liệu \\n Nhập 2 để hiển thị dữ liệu \\n Nhập 3 để thoát");
            choice=sc.nextInt();
            sc.nextLine();
            switch (choice){
                case 1:
                    try {
                        SetListfromHTML();
                        Write_ListToFile(getBatdongsanList());
                    }catch (Exception e){
                        System.out.println("Cần fix "+e);
                    }
                    finally {
                        choice=1;
                    }
                break;
                case 2:
                    System.out.println("Hien thi du lieu: ");
                    try {
                        showList();
                    }
                    catch (Exception e){
                        System.out.println(e);
                    }
            }
        }while(choice==3);

    }
    public void xacthuc()  {
        int timesLog =0;
        String password="";
        do{
            System.out.println("Bạn còn "+(3-timesLog)+" nhập mật khẩu");
            System.out.println("Nhập password: ");
            password=sc.nextLine();
            timesLog++;
        }while(timesLog<3||password==passwordAdmin);
        if (timesLog==3){
            System.out.println("bạn không cơ hội ");
        }else{
            AdminWork();
        }
    }
}
