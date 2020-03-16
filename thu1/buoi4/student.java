package buoi4;

public class student {
   private String name;
   private String MSSV;
   private String birthday;
   private String gender;
   private float GPA;

    public student(String name,String MSSV,String birthday,String gender, float GPA) {
        this.name = name;
        this.MSSV =MSSV;
        this.birthday=birthday;
        this.gender=gender;
        this.GPA=GPA;
    }


    public void setName(String name){
        this.name=name;
    }
    public String getName(){
        return this.name;
    }

    public String getMSSV() {
        return MSSV;
    }

    public void setMSSV(String MSSV) {
        this.MSSV = MSSV;
    }

    public String getBirthday() {
        return birthday;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public float getGPA() {
        return GPA;
    }

    public void setGPA(float GPA) {
        this.GPA = GPA;
    }

    @Override
    public String toString() {
        return "student{" +
                "name='" + name + '\'' +
                ", MSSV='" + MSSV + '\'' +
                ", birthday='" + birthday + '\'' +
                ", gender='" + gender + '\'' +
                ", GPA=" + GPA +
                '}';
    }
}
