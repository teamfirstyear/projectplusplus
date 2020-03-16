package thembuoi5;

public class bao extends taiLieu {
    private String dayedit;
    public String getDayedit() {
        return dayedit;
    }

    public void setDayedit(String dayedit) {
        dayedit=sc.nextLine();
        this.dayedit = dayedit;
    }
    @Override
    public String toString() {
        return "Mã tài liệu: N"+getCode()+
                ", số lượng phát hành: "+getQuantedit()+
                ", Tên tài liệu: "+getName()+
                ", Nhà xuất bản: "+getNxb()+
                ", Ngày phát hành: "+getDayedit();
    }
    @Override
    public void themmoi() {
        nhapcoban();
        System.out.println("Ngày xuát bản: ");
        setDayedit(dayedit);

    }
}
