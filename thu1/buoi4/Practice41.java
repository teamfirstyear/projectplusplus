package buoi4;

import java.util.Scanner;

public class Practice41 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Rectangle rectangle= new Rectangle();
        rectangle.chieudai=sc.nextInt();
        rectangle.chỉeurong=sc.nextInt();
        System.out.println(rectangle.toString());
        System.out.println("Dien tich hcn la: "+rectangle.dientich(rectangle.chieudai,rectangle.chỉeurong));
        System.out.println("Chu vi hcn la: "+rectangle.chuvi(rectangle.chieudai,rectangle.chỉeurong));
    }
}
