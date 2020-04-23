package code.ob;

import code.func.WorkWithList;

public class KhachHang extends WorkWithList {
    private String name;
    private int age;

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

    private  String phonecl;
    public KhachHang(){
        khachHangWork();
    }
    public void khachHangWork(){

    }
}
