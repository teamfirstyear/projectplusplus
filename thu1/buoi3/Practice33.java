package buoi3;

import java.util.Scanner;

public class Practice33 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String sentenc = sc.nextLine();
        String split[]= sentenc.split("\\s+");
        int big=split[0].length();
        String biggest= "";
        for (int i=0;i<split.length;i++){
            int k= split[i].length();
            if (k>big){
                big=k;
                biggest=split[i];
            }
        }
        System.out.println(biggest);

    }
}
