package code.func;

import code.ob.Batdongsan;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;

public abstract class WorkWithList {
    private List<Batdongsan> batdongsanList;
    private ParserFromHtml parser;


    public List<Batdongsan> getBatdongsanList(){

        return batdongsanList;
    }
    public void SetListfromHTML(){
        this.batdongsanList=parser.WriteHTMLtoList();
    }

    public void setBatdongsanList(List<Batdongsan> batdongsanList) {
        this.batdongsanList = batdongsanList;
    }
    public List<Batdongsan> ReadFileToList()throws Exception{
        List<Batdongsan> getBDS = new ArrayList<>();
        FileReader reader = new FileReader("src/databasefromlink");
        BufferedReader bufferedReader = new BufferedReader(reader);
        String  line ="";
        while((line=bufferedReader.readLine())!=null){
            String []split = line.split(" ");
            Batdongsan bdsan = new Batdongsan();
            bdsan.setiD(split[0]);
            bdsan.setDay(split[1]);
            bdsan.setStatus(split[2]);
            bdsan.setAddress(split[3]);
            bdsan.setValue(split[4]);
            bdsan.setArea(split[5]);
            bdsan.setSeller(split[6]);
            bdsan.setPhonenum(split[7]);

        }
        bufferedReader.close();
        reader.close();


        return this.batdongsanList=getBDS;
    }

    public void Write_ListToFile(List<Batdongsan>batdongsanList)throws Exception{
        FileWriter fileWriter = null;
        BufferedWriter bufferedWriter = null;
        try {
            fileWriter = new FileWriter("src/databasefromlink", false);
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




    
}
