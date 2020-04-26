package code.ob;

import code.func.WorkWithList;

import javax.imageio.IIOException;
import javax.swing.*;
import java.io.*;
import java.util.Scanner;

public class KhachHang extends WorkWithList {
    private String name;
    private int age;
    private String phonecl;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPhonecl() {
        return phonecl;
    }

    public void setPhonecl(String phonecl) {
        this.phonecl = phonecl;
    }


    //    public KhachHang(){
//        khachHangWork();
//    }
    public void khachHangWork() throws IOException {
        KhachHang khachHang = new KhachHang();
        Scanner sc = new Scanner(System.in);
        String line = "";
        String info;

//        do {
        System.out.println("Tim kiem thong tin BDS: ");
        info = sc.nextLine();
        FileReader fileReader = new FileReader("databasefromlink.txt");// p la file o projectplusplus/databasefromlink thi moi tim ra file chu ko phai file o src/databasefromlink
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        while ((line = bufferedReader.readLine()) != null) {
            if (line.contains(info))
                System.out.println(line); // t test thu thi cho nay chi in duoc do`ng dau tien cua file
            else System.out.println("Khong tim thay thong tin");

            fileReader.close();
            bufferedReader.close();
        }
//        }
//          while (!line.contains(info)); // cho nay t  dinh neu khach hang go sai thi se lai quay lai "Tim kiem thong tin BDS"
          System.out.println("Ho Ten: ");
          name = sc.nextLine();
          System.out.println("Tuoi: ");
          age = sc.nextInt();
          System.out.println("SDT: ");
          phonecl = sc.nextLine(); // dang bi loi khong vao duoc day ma chi in ra duoc name, age ra receipt

            try {
                FileWriter writer = new FileWriter("receipt.txt");
                BufferedWriter receipt = new BufferedWriter(writer);
                receipt.write(name + ", " + age + ", " + ", " + phonecl); // khi in ra receipt thi no se in ra receipt o out/receipt chu khong phai o src
                receipt.close();
            } catch (Exception e) {
                System.out.println(e);
            }

        }
    }
