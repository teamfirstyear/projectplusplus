package thembuoi5;

public class tapChi extends taiLieu {
    private String numedit;
    private String monthedit;
    public String getNumedit() {
        return numedit;
    }

    public void setNumedit(String numedit) {
        numedit=sc.nextLine();
        this.numedit = numedit;
    }

    public String getMonthedit() {
        return monthedit;
    }

    public void setMonthedit(String monthedit) {
        monthedit=sc.nextLine();
        this.monthedit = monthedit;
    }
    @Override
    public String toString() {
        return "Mã tài liệu: M"+getCode()+
                ", số lượng phát hành: "+getQuantedit()+
                ", Tên tài liệu: "+getName()+
                ", Nhà xuất bản: "+getNxb()+
                ", Số phát hành: "+getNumedit()+
                ", Tháng phát hành: "+getMonthedit();
    }
    @Override
    public void themmoi() {
        nhapcoban();
        System.out.println("nhập số phát hành: ");
        setNumedit(numedit);
        System.out.println("nhập tháng xuất bản: ");
        setMonthedit(monthedit);

    }
}
