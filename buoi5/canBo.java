package buoi5;

import java.util.Scanner;

public class canBo implements Qlcb {
    public Scanner sc = new Scanner(System.in);
    private String name;
    private String tuoi;
    private String diachi;
    private String gioitinh;
    private String chucvu;
    private String nganhdaotao;
    private String congviec;
    private String rank;

    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {


    }

    public String getCongviec() {
        return congviec;
    }

    public void setCongviec(String congviec) {

    }

    public String getNganhdaotao() {
        return nganhdaotao;
    }

    public void setNganhdaotao(String nganhdaotao) {

    }

    public void nhapcoban(){
        System.out.println("nhap ten: ");
        setName(name);
        System.out.println("nhap tuoi: ");
        setTuoi(tuoi);
        System.out.println("nhap dia chi:");
        setDiachi(diachi);
        System.out.println("nhap gioi tinh: ");
        setGioitinh(gioitinh);
    }
    public String getGioitinh() {
        return gioitinh;
    }

    public void setGioitinh(String gioitinh) {
        gioitinh=sc.nextLine();
        this.gioitinh = gioitinh;
    }

    public String getChucvu() {
        return chucvu;
    }

    public void setChucvu(String chucvu) {
        this.chucvu = chucvu;
    }

    public String getDiachi() {
        return diachi;
    }

    public void setDiachi(String diachi) {
        diachi=sc.nextLine();
        this.diachi = diachi;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        name = sc.nextLine();
        this.name = name;
    }

    public String getTuoi() {
        return tuoi;
    }

    public void setTuoi(String tuoi) {
        tuoi= sc.nextLine();
        this.tuoi = tuoi;
    }



    @Override
    public void inra() {
        System.out.println(toString());
    }

    @Override
    public void timkiemten(String search) {
        if(search.equals(getName())){
            System.out.println("Đã tìm thấy:");
            System.out.println(toString());
        }

    }

    @Override
    public void themcanbo() {

    }
}



