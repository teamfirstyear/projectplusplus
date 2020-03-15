package buoi5;

public class nhanVien extends canBo {
    private String congviec;

    public String getCongviec() {
        return congviec;
    }

    public void setCongviec(String congviec) {
        congviec=sc.nextLine();
        this.congviec = congviec;
    }

    @Override
    public String toString() {
        return "ten can bo: "+getName()+
                ", tuoi: "+getTuoi()+
                ", gioi tinh: "+getGioitinh()+
                ", chuc vu: "+getChucvu()+
                ", cong viec : "+getCongviec()+
                ", dia chi: "+getDiachi();
    }
  /*  public void inra() {
        System.out.println(toString());
    }*/

    /*@Override
    public void timkiemten(String search) {
        if(search.equals(getName())){
            System.out.println(toString());
        }
    }*/

    @Override
    public void themcanbo() {
        String congviec = "";
        nhapcoban();
        System.out.println("nhap cong viec: ");
        setCongviec(congviec);

    }


}
