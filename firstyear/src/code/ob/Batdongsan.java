package code.ob;

public class Batdongsan {
    private String iD;
    private String day;
    private String address;
    private String value;
    private String area;
    private String phonenum;
    private String status;
    private String seller;

    public String getiD() {
        return iD;
    }

    public void setiD(String iD) {
        if(iD.equals("")){
            iD="no information";
        }
        this.iD = iD;
    }

    public String getDay() {
        return day;
    }

    public void setDay(String day) {
        if(day.equals("")){
            day="no information";
        }
        this.day = day;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        if(address.equals("")){
            address="no information";
        }
        this.address = address;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        if(value.equals("")){
            value="no information";
        }
        this.value = value;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        if(area.equals("")){
            area="no information";
        }
        this.area = area;
    }

    public String getPhonenum() {
        return phonenum;
    }

    public void setPhonenum(String phonenum) {
        if(phonenum.equals("")){
            phonenum="no information";
        }
        this.phonenum = phonenum;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        if(status.equals("")){
            status="no information";
        }
        this.status = status;
    }

    public String getSeller() {
        return seller;
    }

    public void setSeller(String seller) {
        if(seller.equals("")){
            seller="no information";
        }
        this.seller = seller;
    }

    @Override
    public String toString() {
        return
                 iD + "??" +
                 day + "??" +
                 address + "??" +
                 value + "??" +
                 area + "??" +
                 phonenum + "??" +
                 status + "??" +
                 seller ;
    }
}
