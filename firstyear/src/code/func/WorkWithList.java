package code.func;

import code.ob.Batdongsan;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public abstract class WorkWithList {
    private List<Batdongsan> batdongsanList;

    public List<Batdongsan> getBatdongsanList(){

        return batdongsanList;
    }


    public void setBatdongsanList(List<Batdongsan> batdongsanList) {
        this.batdongsanList = batdongsanList;
    }
    public List<Batdongsan> ReadFileToList()throws Exception{
        List<Batdongsan> getBDS = new ArrayList<>();
        FileReader reader = new FileReader("src/code/databasefromlink");
        BufferedReader bufferedReader = new BufferedReader(reader);
        String  line ="";
        while((line=bufferedReader.readLine())!=null){
            String []split = line.split("//");
            Batdongsan bdsan = new Batdongsan();
            bdsan.setiD(split[0]);
            bdsan.setDay(split[1]);
            bdsan.setStatus(split[2]);
            bdsan.setAddress(split[3]);
            bdsan.setValue(split[4]);
            bdsan.setArea(split[5]);
            bdsan.setSeller(split[6]);
            bdsan.setPhonenum(split[7]);
            getBDS.add(bdsan);

        }
        bufferedReader.close();
        reader.close();


        return this.batdongsanList=getBDS;
    }

    public void Write_ListToFile(List<Batdongsan>batdongsanList)throws Exception{
        FileWriter fileWriter = null;
        BufferedWriter bufferedWriter = null;
        try {
            fileWriter = new FileWriter("src/code/databasefromlink", false);
            bufferedWriter = new BufferedWriter(fileWriter);
            for (int i = 0; i < batdongsanList.size(); i++) {
                bufferedWriter.write(batdongsanList.get(i).toString());
                bufferedWriter.newLine();
            }
        }
        catch(Exception e){
            System.out.println(e);
        }
        finally {
            bufferedWriter.close();
            fileWriter.close();

        }

    }

    public void showList(List<Batdongsan> batdongsanList)  {
        for(int i=0;i<batdongsanList.size();i++){
            System.out.print("ID: "+batdongsanList.get(i).getiD());
            System.out.print("//Trạng thái: "+batdongsanList.get(i).getStatus());
            System.out.print("//Ngày rao:  "+batdongsanList.get(i).getDay());
            System.out.print("//Giá trị: "+batdongsanList.get(i).getValue());
            System.out.print("//Diện tích: "+batdongsanList.get(i).getArea());
            System.out.print("//Người bán: "+batdongsanList.get(i).getSeller());
            System.out.print("//Số điện thoại: "+batdongsanList.get(i).getPhonenum());
            System.out.print("//Tên bất động sản "+batdongsanList.get(i).getAddress());
            System.out.println();
        }

    }




    
}
