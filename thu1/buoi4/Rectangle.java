package buoi4;

public class Rectangle {
    int chieudai;
    int chỉeurong;

    public int getChieudai() {
        return chieudai;
    }

    public void setChieudai(int chieudai) {
        this.chieudai = chieudai;
    }

    public int getChỉeurong() {
        return chỉeurong;
    }

    public void setChỉeurong(int chỉeurong) {
        this.chỉeurong = chỉeurong;
    }
    public int dientich(int chieudai,int chỉeurong){
        return (chieudai*chỉeurong);
    }
    public int chuvi(int chieudai,int chỉeurong){
        return (chieudai+chỉeurong)*2;
    }

    @Override
    public String toString() {
        return "chieu dai va chieu rong cua hinh chu nhat lan luot la: "+chỉeurong+" va "+chieudai;
    }
}
