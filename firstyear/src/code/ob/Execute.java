package code.ob;

import java.io.IOException;
import java.util.Scanner;

public class Execute {
    public void hienthi()  {
        Scanner sc = new Scanner(System.in);
        String danhtinh ="";
        do {
            System.out.println("Xin chào, bạn là:(admin/khach hang)? ");
            danhtinh = sc.nextLine();
            if(danhtinh.trim().equalsIgnoreCase("admin")){
                Admin ad= new Admin();
                danhtinh=ad.xacthuc(danhtinh);
            }else {
                KhachHang client =new KhachHang();
                try {
                    client.khachHangWork();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }while(!danhtinh.equalsIgnoreCase("y"));


    }
}
