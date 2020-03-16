package buoi3;


import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Practice34 {
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner sc= new Scanner(System.in);
        System.out.println("Input the array: ");
        int arr[]=new int[10] ;
        for (int i= 0; i<10; i++){
            arr[i]=rand.nextInt(10)+1;
        }
        for (int i= 0; i<9;i++){
            System.out.print(arr[i]+", ");
        }
        System.out.println(arr[9]+".");
        int dem=0;

        Arrays.sort(arr);
        String str=""+arr[0]+" ";
        for (int i=0;i<9;i++){
            if (arr[i]==arr[i+1]){
                dem=dem+1;

            }
            if(arr[i]!=arr[i+1]){
                str=str+arr[i+1]+" ";
            }
        }
        System.out.println(str);
        System.out.println("new lenght of array: "+(10-dem));


    }
}
