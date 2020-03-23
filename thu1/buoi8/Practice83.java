package buoi8;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Random;
import java.util.Scanner;

public class Practice83 {
    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<>();
        LinkedList<Integer> list2 = new LinkedList<>();
        Random rand =new Random();
        int k =rand.nextInt((20000-10000)+1)+10000;
        for(int i =0;i<k;i++){
            list1.add(i,rand.nextInt());
            list2.add(i,rand.nextInt());
        }
        System.out.printf("%-10s%s\n","ArrayList","LinkedList");

        for (int i= 0;i<10;i++){
            long start = System.nanoTime();
            list1.get(k/2);
            list1.add(k/2,rand.nextInt());
            long end =System.nanoTime();
            long delt = end-start;
            long start1 = System.nanoTime();
            list2.get(k/2);
            list2.add(k/2,rand.nextInt());
            long end1 =System.nanoTime();
            long delt1 = end1-start1;
            System.out.printf("%-10d%-11d%s\n",delt,delt1,"(nano time)");
        }
        System.out.println(" ArrayList accesses its middle element better than LinkedList");
    }
}
