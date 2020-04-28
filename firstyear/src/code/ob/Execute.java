package code.ob;

import java.io.IOException;
import java.util.Scanner;

public class Execute {
    public void hienthi()  {
        Scanner sc = new Scanner(System.in);
        String danhtinh ="";
        do {
            System.out.println("Xin chào, bạn là: ");
            danhtinh = sc.nextLine();
            if(danhtinh.trim().equalsIgnoreCase("admin")){
                Admin ad= new Admin();
                ad.xacthuc();
            }else {
                KhachHang client =new KhachHang();
                try {
                    client.khachHangWork();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            System.out.println("Bạn có chắc muốn thoát không(y/n)?");
            danhtinh=sc.nextLine();
        }while(!danhtinh.equalsIgnoreCase("y"));
        System.out.println("Tạm biệt!");
    }
}
