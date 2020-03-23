package buoi8;

import java.util.LinkedList;
import java.util.Scanner;

public class Practice81 {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        Scanner sc =new Scanner(System.in);
        int quant =sc.nextInt();
        for (int i=0;i<quant; i++){
            list.add(i,sc.nextInt());
        }
        int q = sc.nextInt();

        for (int i=1;i<=q;i++){
            String queries = sc.next();
            if(queries.equalsIgnoreCase("Insert")){
                list.add(sc.nextInt(),sc.nextInt());
            } else if(queries.equalsIgnoreCase("Delete")){
                list.remove(sc.nextInt());
            }
        }
        for (int u :list){
            System.out.print(u+" ");
        }
    }
}
