package coding;

import java.io.*;
import java.util.List;
import coding.parse.inforEstate;

public class admin{
    public void thaoTac_admin() {
//          Yêu cầu admin làm những công việc
                    //// bằng cách thực hiện các hàm trong class này
//        1. Nhap du lieu
//        2. Cap nhat du lieu
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
