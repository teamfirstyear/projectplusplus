package thembuoi5;

import java.util.Scanner;

public class taiLieu implements Qltc{
    public Scanner sc =new Scanner(System.in);
    private String type;
    private String code;
    private String nxb;
    private String quantedit;
    private String author;
    private String numpages;
    private String numedit;
    private String monthedit;
    private String dayedit;
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        name=sc.nextLine();
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void nhapcoban(){
        System.out.println("nhap ma tai lieu với cú pháp: (B/M/N)xxxxx");
        setCode(code);
        System.out.println("nhap ten tai lieu: ");
        setName(name);
        System.out.println("nhap nhà xuat ban: ");
        setNxb(nxb);
        System.out.println("so ban phat hanh: ");
        setQuantedit(quantedit);

    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        code = sc.nextLine();
        this.code = code;
    }

    public String getNxb() {
        return nxb;
    }

    public void setNxb(String nxb) {
        nxb=sc.nextLine();
        this.nxb = nxb;
    }

    public String getQuantedit() {
        return quantedit;
    }

    public void setQuantedit(String quantedit) {
        quantedit=sc.nextLine();
        this.quantedit = quantedit;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {

    }

    public String getNumpages() {
        return numpages;
    }

    public void setNumpages(String numpages) {

    }

    public String getNumedit() {
        return numedit;
    }

    public void setNumedit(String numedit) {

    }

    public String getMonthedit() {
        return monthedit;
    }

    public void setMonthedit(String monthedit) {

    }


    public String getDayedit() {
        return dayedit;
    }

    public void setDayedit(String dayedit) {

    }

    @Override
    public String toString() {
        return "Mã tài liệu: "+code
                +"Tên tài liệu: "+name+
                " Nhà xuất bản: "+nxb+
                " số lượng phát hành: "+quantedit;
    }

    @Override
    public void themmoi() {

    }

    @Override
    public void xoatailieu() {

    }

    @Override
    public void hienthi() {
        System.out.println(toString());
    }

    @Override
    public void timkiemtailieu(String search1,String search2) {
        if(search1.equals(getType())){
            System.out.println("Đã tìm thấy: "+getType());
            System.out.println(toString());
        }else if(search1.equals(getType()) && search2.equals(getName())){
            System.out.println("Found: ");
            System.out.println(toString());
        }

    }
}
