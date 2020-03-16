package buoi3;

import java.util.Random;
import java.util.Scanner;

public class Practice32 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        System.out.println("Input the quantity of array you want:  ");
        int quantity=sc.nextInt();
        int arr1[][]= new int [2][quantity];
        for (int i=0;i<2;i++){
            for (int j=0;j<quantity;j++) {
                arr1[i][j] = rand.nextInt(20) + 1;
            }
        }
        System.out.println("Input: ");
        for (int i=0;i<2;i++) {
            System.out.print("unsorted "+(i+1)+"= ");
            for (int j = 0; j < quantity-1; j++) {
                System.out.print(arr1[i][j]+", ");
            }
            System.out.println(arr1[i][quantity-1]+".");
        }////////tạo mảng hai chiều và in ra thành hai dãy số

        /////thực hiện công việc: sắp xếp + in thành 1 dòng
        int arr3[]=new int [quantity*2];
        for(int i=0;i<2;i++){
            for(int j=0;j<quantity;j++){
                arr3[i*quantity+j]=arr1[i][j];
            }
        }
        int swap=0;
        for(int k=0;k<quantity*2;k++){
            for (int i=0;i<quantity*2-1;i++){
                if(arr3[i+1]<arr3[i]){
                    swap=arr3[i+1];
                    arr3[i+1]=arr3[i];
                    arr3[i]=swap;
                }
            }
        }
        System.out.println("Output: ");
        for (int i=0;i<quantity*2;i++){
            System.out.print(arr3[i]+" ");
        }
    }
}
