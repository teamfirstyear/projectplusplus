package code.func;

import code.ob.Batdongsan;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public abstract class WorkWithList {
    private List<Batdongsan> batdongsanList=null;

    public List<Batdongsan> getBatdongsanList(){

        return batdongsanList;
    }


    public void setBatdongsanList(List<Batdongsan> batdongsanList) {
        this.batdongsanList = batdongsanList;
    }
    public List<Batdongsan> ReadFileToList()throws Exception{
        List<Batdongsan> getBDS = new ArrayList<>();
        FileReader reader = new FileReader("databasefromlink");
        BufferedReader bufferedReader = new BufferedReader(reader);
        String  line ="";
        while((line=bufferedReader.readLine())!=null){
            String []split = line.split("\\?+");
            Batdongsan bdsan = new Batdongsan();
            bdsan.setiD(split[0]);
            bdsan.setDay(split[1]);
            bdsan.setStatus(split[6]);
            bdsan.setAddress(split[2]);
            bdsan.setValue(split[3]);
            bdsan.setArea(split[4]);
            bdsan.setSeller(split[7]);
            bdsan.setPhonenum(split[5]);
            getBDS.add(bdsan);

        }
        bufferedReader.close();
        reader.close();
        setBatdongsanList(getBDS);
        return getBDS;
    }

    public void Write_ListToFile(List<Batdongsan>batdongsanList)throws Exception{
        FileWriter fileWriter = null;
        BufferedWriter bufferedWriter = null;
        try {
            fileWriter = new FileWriter("databasefromlink", false);
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
        System.out.printf("||%-10s%-12s%-58s%-56s%-15s%-18s%-25s%-10s||\n","ID","Ngày rao","Loại Bất Động Sản",
                "Tên Bất Động Sản","Giá Trị","Diện TÍch","Người Rao","SĐT");
        System.out.println("--------------------------------------------------------------------------------------------" +
                "-------------------------------------------------------------------------------------------------------" +
                "------");
        for(int i=0;i<batdongsanList.size();i++){
                    System.out.printf("||%-10s%-12s%-58s%-56s%-15s%-18s%-25s%-10s||\n",batdongsanList.get(i).getiD(),
                    batdongsanList.get(i).getDay(),batdongsanList.get(i).getStatus(), batdongsanList.get(i).getAddress(), batdongsanList.get(i).getValue(),
                    batdongsanList.get(i).getArea(),batdongsanList.get(i).getSeller(),batdongsanList.get(i).getPhonenum());
                    System.out.println("--------------------------------------------------------------------------------------------" +
                    "-------------------------------------------------------------------------------------------------------" +
                    "------");

        }

    }




    
}
