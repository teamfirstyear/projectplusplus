package coding;

public class bdsan implements chucnang {
    private String iD;
    private String type;
    private String province;
    private String district;
    private String value;
    private String area;
    private String timesell;
    private String phonenum;
    private String status;

    public String getiD() {
        return iD;
    }

    public void setiD(String iD) {      //////// đếm số bất động sản tìm được với 5 số VD:00001, 00002,....//////
        this.iD = iD;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
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

    public String getTimesell() {
        return timesell;
    }

    public void setTimesell(String timesell) {
        this.timesell = timesell;
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
}
