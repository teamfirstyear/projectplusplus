package buoi3;

import java.util.Random;
import java.util.Scanner;

public class Practice31 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand =new Random();
        System.out.println(" input the unsorted array of integers: ");
        int arr[]= new int [10];
        for (int i=0;i<10;i++){
            arr[i]=rand.nextInt(4)+1;
        }
        for (int i=0;i<9;i++){
            System.out.print(arr[i]+", ");
        }
        System.out.println(arr[9]+".");
        int k =1;
        int biggest=0;

        String larray="";
        while(k<9) {
            int dem =0;
            int a=k;
            String narray="";
            while (a<9 && arr[a+1]-arr[a]==1){
                dem=dem+1;
                narray=narray+arr[a]+" ";
                a++;
                //kết thúc while được 1 dãy các số liên tiếp nhưng thiếu thành phần đầu
            }
            if(biggest<dem){
            biggest=dem+1;
            larray=narray;/// có thể thêm dòng code để hiện thị được dáy số đó vs đầy đủ phần tử
            }
            k++;
        }
        System.out.println(larray);
        System.out.println("the length of the longest consecutive elements sequence: "+biggest);
    }
}
