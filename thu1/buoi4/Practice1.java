package buoi4;

import java.util.Scanner;

public class Practice1 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        student[] Studentarr= new student[10];
        Studentarr[0] =new student("abc","2151818","626611","avav",4);
        System.out.print("Input student number: ");
        String mssv=sc.nextLine();
        for(student st: Studentarr){
            if(st.getName().equals(mssv)){
                System.out.println(st.toString());
                break;
            }
        }

    }
}
