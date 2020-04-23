package coding;

import com.sun.xml.internal.bind.v2.model.core.ID;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.List;
import java.util.Scanner;


public class client {
    private String name;
    private int age;
    private List<bdsan>bdsanList;
    private String phonecl;
    public Scanner sc =new Scanner(System.in);
    public client() {

    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPhonecl() {
        return phonecl;
    }

    public void setPhonecl(String phonecl) {
        this.phonecl = phonecl;
    }

    public void thao_Tac_client() throws Exception  {
        String [] label = {"ID","Ngày rao","Trạng thái","Địa chỉ","Giá trị","Diện tích","Người rao","SĐT"};
        client client= new client();
        client.readFileToList(bdsanList);
        String [][]showListbds = new String[bdsanList.size()][8];
        for(int i=0;i<bdsanList.size();i++){
            showListbds[i][0]=bdsanList.get(i).getiD();
            showListbds[i][1]=bdsanList.get(i).getDay();
            showListbds[i][2]=bdsanList.get(i).getStatus();
            showListbds[i][3]=bdsanList.get(i).getAddress();
            showListbds[i][4]=bdsanList.get(i).getValue();
            showListbds[i][5]=bdsanList.get(i).getArea();
            showListbds[i][6]=bdsanList.get(i).getSeller();
            showListbds[i][7]=bdsanList.get(i).getPhonenum();
        }




        System.out.println("Nhập 1 để hiện thị danh sách các bất động sản hiện có \\n" +
                "Nhập 2 để chọn bds theo ý muốn \\n" +
                "Nhập 3 để exit;");

        int choice = sc.nextInt();
        sc.nextLine();
        while(choice!= 1&&choice!=2&&choice!=3){
            System.out.println("Mời bạn nhập lại: ");
            choice =sc.nextInt();
            sc.nextLine();
        }
        if(choice==1){

        }else if(choice==2){

        }else{

        }

    }
    public void readFileToList(List<bdsan> bdsanList)throws Exception{
        FileReader reader = new FileReader("src/databasefromlink");
        BufferedReader bufferedReader = new BufferedReader(reader);
        String  line ="";
        while((line=bufferedReader.readLine())!=null){
            String []split = line.split(" ");
            bdsan bdsan = new bdsan();
            bdsan.setiD(split[0]);
            bdsan.setDay(split[1]);
            bdsan.setStatus(split[2]);
            bdsan.setAddress(split[3]);
            bdsan.setValue(split[4]);
            bdsan.setArea(split[5]);
            bdsan.setSeller(split[6]);
            bdsan.setPhonenum(split[7]);
            bdsanList.add(bdsan);
        }
        bufferedReader.close();
        reader.close();

    }

}
