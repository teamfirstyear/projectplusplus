package buoi3;

import java.util.Random;
import java.util.Scanner;

public class new1 {
    public static void main(String[] args) {
        int []mang1[] = new int[3][3];
        Scanner sc=new Scanner(System.in);
        for (int i=0;i<3;i++){
            for(int j=0;j<3;j++) {
                mang1[i][j] = sc.nextInt();
            }

        }
        for (int i=0;i<3;i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(mang1[i][j]+" ");
            }
            System.out.println();
        }
    }
}

