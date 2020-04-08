package coding;

import java.io.*;
import java.util.List;
import java.util.Scanner;
import coding.parse.inforEstate;

public class admin{
    public void thaoTac_admin() throws IOException {
//          Yêu cầu admin làm những công việc
                    //// bằng cách thực hiện các hàm trong class này
//        1. Nhap du lieu
//        2. Cap nhat du lieu
        admin admin = new admin();
        System.out.println("Xin chao Admin.");
        System.out.println("Enter 1 de nhap du lieu.");
        System.out.println("Enter 2 de Cap nhat du lieu.");
        Scanner scanner = new Scanner(System.in);
        int nhap_Lua_Chon = scanner.nextInt();

        switch (nhap_Lua_Chon){
            case 1:
                admin.writeToFile();
            case 2:
                FileReader fileReader = new FileReader("src/databasefromlink.txt");
                BufferedReader bufferedReader = new BufferedReader(fileReader);
                String line = "";
                int i =0;
                String [] data = new String[100];
                while ((line = bufferedReader.readLine()) != null){
                    data[i] = line;
                    i++;
                    if(data[i] == null){
                        break;
                    }
                }
                for(int i1 =0; i1< data.length; i1++ ){
                    for (String datas : data){
                        if (data[i].equals(datas)){
                            data[i] = null;
                        }
                    }
                }


        }
    }
    void writeToFile() throws IOException {
        inforEstate iE = new inforEstate();
        String url = "https://batdongsan.com.vn/nha-dat-ban-ha-noi/";
        List<String> linkArray= iE.listLink(url);
        FileWriter fileWriter = null;
        BufferedWriter bufferedWriter = null;
        try {
            fileWriter = new FileWriter("src/databasefromlink.txt", true);
            bufferedWriter = new BufferedWriter(fileWriter);
            for (int i = 0; i < linkArray.size(); i++) {
                bufferedWriter.write(iE.parserclone(linkArray.get(i)).toString());
            }
        }
        catch(Exception e){
            System.out.println(e);
        }
        finally {
            fileWriter.close();
            bufferedWriter.close();
        }
    }
}
