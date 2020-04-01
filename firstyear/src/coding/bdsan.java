package coding;

public class bdsan  {
    private String iD;
    private String day;
    private String district;
    private String value;
    private String area;
    private String phonenum;
    private String status;
    private String seller;
    private String directhome;

    public String getDirecthome() {
        return directhome;
    }

    public void setDirecthome(String directhome) {
        this.directhome = directhome;
    }

    public String getSeller() {
        return seller;
    }

    public void setSeller(String seller) {
        this.seller = seller;
    }

    public String getiD() {
        return iD;
    }

    public void setiD(String iD) {      //////// đếm số bất động sản tìm được với 5 số VD:00001, 00002,....//////
        this.iD = iD;
    }

    public String getDay() {
        return day;
    }

    public void setDay(String day) {
        this.day = day;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getPhonenum() {
        return phonenum;
    }

    public void setPhonenum(String phonenum) {
        this.phonenum = phonenum;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return {
                "Mã bài đăng= " + iD + ", Ngày đăng= " + day +", Trạng thái='" + status + " Địa chỉ= "
                        + district +", Giá trị='" + value + ", directhome='" + directhome+
                ", Diện tích= " + area +", Người rao='" + seller +
                ", Điện thoại liên lạc= " + phonenum;
    }
}
