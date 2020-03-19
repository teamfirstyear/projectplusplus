package buoi7;

import java.util.Scanner;

public class baitap {
    public static void main(String[] args) {
        int arr[] = new int[5];
        Scanner sc =new Scanner(System.in);
        System.out.print("nhâp phần tử: ");
        int i =sc.nextInt();
        sc.nextLine();
        ///////////////////không dùng Exception e////////


        try{
            System.out.print("giá trị phần tử "+i+": ");
            String val = sc.nextLine();
            arr[i]=Integer.valueOf(val);
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.print("arr["+i+"] = " );
            System.out.println(e);
        }catch (NumberFormatException e){
            System.out.println("giá trị phần tử bị nhập sai");
        }finally {
            System.out.println(" xong test lần 1");
        }

        int zero = 0;
        int average =0;
        try {
            zero = 0;
            average = 10 / zero;
        }catch (ArithmeticException e){
            average=9999999;
        System.out.println(average);
            System.out.println("phép chia cho 0 là không nên dùng");
        }finally {
            System.out.println("xong test 2");
        }
        try {

            String obj = null;
            System.out.println(obj.length());
        }catch (NullPointerException e){
            System.out.println("chuỗi này hiên vẫn chưa có một phần nào, lần sau hãy thêm vào phiên làm việc của mình");
        }
        System.out.println("Finished!");
    }
}
