package buoi2;

import java.util.Scanner;

public class Practice3 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Input the num: ");
        int n =sc.nextInt();
        System.out.println("the sum of 1 to "+n+"is "+f(n));
        System.out.print("the average is "+(ave(n)));
    }
    public static int f(int a){
        int sum=1;
        if (a<=100){
        for (int i=2;i<=a;i++){
            sum+=i;
        }
        return sum;
        } else if(a<1000) {
            int k =1;
            while (k<=a){
                sum =sum +k;
                k++;
            }
            return sum;
        } else {
            int k=1;
            do{sum=sum+k; k++;}while(k<=a);
            return sum;
        }
    }
    public static float ave(int a){
        float k =f(a);
        return k/a;
    }
}
