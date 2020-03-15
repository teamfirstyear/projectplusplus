package buoi5;

public class kySu extends  canBo  {
    private String nganhdaotao;

    public String getNganhdaotao() {
        return nganhdaotao;
    }

    public void setNganhdaotao(String nganhdaotao) {
        nganhdaotao=sc.nextLine();
        this.nganhdaotao = nganhdaotao;
    }


    @Override
    public String toString() {
        return "ten can bo: "+getName()+
                ", tuoi: "+getTuoi()+
                ", gioi tinh: "+getGioitinh()+
                ", chuc vu: "+getChucvu()+
                ", nganh dao tao: "+getNganhdaotao()+
                ", dia chi: "+getDiachi();

    }
    /*public void inra() {
        System.out.println(toString());
    }*/

    /*@Override
    public void timkiemten(String search) {

    }*/

    @Override
    public void themcanbo() {
        String nganhdaotao = "";
        nhapcoban();
        System.out.println("nhap nganh dao tao: ");
        setNganhdaotao(nganhdaotao);

    }




}
