package buoi5;

public class congNhan extends canBo {
    private String rank;


    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        rank =sc.nextLine();
        int rk =Integer.valueOf(rank);
        while(rk<1&&rk>10){
            System.out.println("nhap lai rank trong 1-10: ");
            rank=sc.nextLine();
            rk=Integer.valueOf(rank);
        }
        this.rank = rank;

    }

    @Override
    public String toString() {
        return "ten can bo: "+getName()+
                ", tuoi: "+getTuoi()+
                ", gioi tinh: "+getGioitinh()+
                ", chuc vu: "+getChucvu()+
                ", hang cong nhan : "+getRank()+
                ", dia chi: "+getDiachi();
    }
   /* public void inra() {

    }*/

    /*@Override
    public void timkiemten(String search) {
        if(search.equals(getName())){
            System.out.println(toString());
        }
    }*/

    @Override
    public void themcanbo() {
        String rank = "";
        nhapcoban();
        System.out.println("nhap hang cong nhan: ");
        setRank(rank);

    }


}
