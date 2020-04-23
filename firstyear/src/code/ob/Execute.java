package code.ob;

import java.util.Scanner;

public class Execute {
    public Execute()  {
        hienthi();
    }
    public void hienthi()  {
        Scanner sc = new Scanner(System.in);
        System.out.println("Xin chào, bạn là: ");
        String danhtinh ="";
        do {
            danhtinh = sc.nextLine();
            if(danhtinh.trim().equalsIgnoreCase("admin")){
                Admin ad= new Admin();
                ad.xacthuc();
            }else {
                KhachHang client =new KhachHang();
                client.khachHangWork();
            }
            System.out.println("Bạn có chắc muốn thoát không(y/n)?");
            danhtinh=sc.nextLine();
        }while(danhtinh!="n");
        System.out.println("Tạm biệt");
    }
}
