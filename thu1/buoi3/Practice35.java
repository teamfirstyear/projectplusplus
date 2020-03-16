package buoi3;

import java.util.Random;
import java.util.Scanner;

public class Practice35 {
    public static void main(String[] args) {
        System.out.println("Input the number of numbers appearing in a array:");
        Random rand = new Random();
        Scanner sc = new Scanner(System.in);
        int quant= sc.nextInt();
        int arr[]= new int [quant];
        for (int i =0;i<quant;i++){
            arr[i]=rand.nextInt((20-(-20))+1)-20;
        }
        for (int i =0; i<quant-1;i++){
            System.out.print(arr[i]+", ");
        }
        System.out.println(arr[quant-1]+".");
        float sumave=0;
        float dem=0;
        for (int i=0;i<quant;i++){
            if(arr[i]%2!=0 && (i+1)%2==0 && arr[i]>0){
                sumave=sumave+arr[i];
                dem=dem+1;
            }
        }
        float result1=0;
        if(dem!=0){result1=sumave/dem;}else {result1=0;}
        System.out.println("Target 1: Average of odd numbers in even position: "+result1 );


        ////////////////Finish 1///////


        int biggest =0;
        for (int i=0;i<quant;i++){
            if(arr[i]>biggest){
                biggest=arr[i];
            }
        }
        System.out.println("Target 2: the biggest number: "+biggest);

        ////////Finish 2////////


        String Indexmin="";
        int min =arr[0];
        for (int i=1;i<quant;i++){
            if(arr[i]<min){
                min=arr[i];
            }

        }
        for(int i=0;i<quant;i++){
            if (arr[i]==min){
                Indexmin=Indexmin+(i+1)+",";
            }
        }
        System.out.println("Target 3: Location of the minimum number: "+Indexmin);


        /////Finish 3/////
        int dem1=0;
        for (int num : arr){
            if(num>=0) {
                double sqr = Math.sqrt(num);
                if (sqr == (int) sqr) {
                    dem1 = dem1 + 1;
                }
            }
        }
        System.out.println("Target 4: the number of perfect squares in this array: "+dem1);

        /////Finish 4/////
        ///cách không dùng boolean///

        String prime="";
        for(int num:arr){
            int dem3=0;
            if(num>=2){
                for(int k=2;k<=Math.sqrt(num);k++){
                    if(num%k==0){
                        dem3=dem3+1;
                    }
                }
                if(dem3==0){
                    prime=prime+num+" ";
                }
            }

        }
        if(prime.isEmpty()){
            prime=prime+0;
        }
        System.out.println("Target 5: Prime number in this array: "+prime);
        /////Finish 5///

        String arr3="";
        System.out.print("Target 6: Change negative number by 0 and print the new array: ");
        for (int num :arr){
            if(num<0){
                num=0;
            }else {arr3=arr3+num+" ";}
            System.out.print(num+" ");
        }
        System.out.println();
        /////Finish 6////

        System.out.println("Target 7: Delete all negative number in this array: "+arr3);
        //////Finish 7////
        int swap =0;
        for (int i=0;i<quant;i++){
            for (int j=0;j<quant-1;j++){
                if(arr[j]<arr[j+1]){
                    swap=arr[j+1];
                    arr[j+1]=arr[j];
                    arr[j]=swap;
                }
            }
        }
        System.out.print("Target 8: Sort array in descending order: ");
        for(int num: arr){
            System.out.print(num+" ");
        }
        //////Finish 8///+ Endgame
    }

}
