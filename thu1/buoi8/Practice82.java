package buoi8;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Practice82 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("There is a list you want: ");
        List<String> color =new ArrayList<>();
        for(int i=0;i<5;i++){
            System.out.print("put a string to index "+i+" : ");
            color.add(i,sc.nextLine());
        }
        color.stream().forEach(s -> System.out.println(s));
        System.out.println("Give me an index (<5) and value of string you want to add ");
        System.out.println(" Please after insert the index, press Enter to continue this work: ");
        color.add(sc.nextInt(),sc.next());
        color.stream().forEach(s -> System.out.println(s));
    }
}
