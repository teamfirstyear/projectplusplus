package thembuoi5;

public class sach extends taiLieu {
    private String author;
    private String numpages;

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        author = sc.nextLine();
        this.author = author;
    }
    public String getNumpages() {
        return numpages;
    }

    public void setNumpages(String numpages) {
        numpages=sc.nextLine();
        this.numpages = numpages;
    }
    @Override
    public String toString() {
        return "Mã tài liệu: B"+getCode()+
                ", số lượng phát hành: "+getQuantedit()+
                ", Tên tài liệu: "+getName()+
                ", Nhà xuất bản: "+getNxb()+
                ", Tác giả: "+getAuthor()+
                ", có : "+getNumpages()+" trang.";
    }
    @Override
    public void themmoi() {
        nhapcoban();
        System.out.println("nhập tên tác giả: ");
        setAuthor(author);
        System.out.println("nhập số trang: ");
        setNumpages(numpages);
    }
}
