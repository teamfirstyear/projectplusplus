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
//       x 2. Cap nhat du lieu
        admin admin = new admin();
        Scanner scanner = new Scanner(System.in);
        int nhap_Lua_Chon=0;
        System.out.println("Xin chao Admin.");
        do {
            System.out.println("Enter 1 de nhap du lieu.");
            System.out.println("Enter 2 de Cap nhat du lieu.");
            System.out.println("Enter 3 de thoat ");
            nhap_Lua_Chon = scanner.nextInt();

            switch (nhap_Lua_Chon){
                case 1:
                    System.out.println("Loading... Xin đợi một chút");
                    admin.writeToFile();
                    System.out.println("đã hoàn tất nhập dữ liệu vào file");
                    System.out.println("Enter 2 để quay về giao diện admin");
                    nhap_Lua_Chon = scanner.nextInt();
                    break;                                              ////bro thiếu break rồi:))
                case 2:
                    FileReader fileReader = new FileReader("src/databasefromlink");
                    BufferedReader bufferedReader = new BufferedReader(fileReader);
                    String line = "";
                    int i =0;
                    String [] data = new String[100];                       /////////// chỗ này nên dùng HashMap nhé
                    while ((line = bufferedReader.readLine()) != null){     /////dùng HashMap nó sẽ tự động xóa bớt mấy cái trùng, không cần IF
                        data[i] = line;                                     //// :)) lưu như này dài
                        i++;                                                ////////// nếu theo cách bro thì nên lưu cái iD là được
                                                                            /// và cách của bro nên tiến hành như sau:
                                                                    ////   dùng cái inforEsate ->>dữ liệu->>> vào mảng
                                                                    ///     từ mảng->>đọc lần lượt->>>nếu thấy trùng iD thì sẽ không in

                                                                //// nhưng sẽ phải duyệt khá lâu để xem có bị trùng không
                                            ////=>>>>>bro nên dùng 2 HashMap: 1 cái lưu iD đã có ở text; 1 cái lưu iD từ jsoup
                                            //so sánh các cái iD với nhau cái nào trùng với gốc thì sẽ ko in
                        if(data[i] == null){
                            break;
                        }
                    }
                    for(int i1 =0; i1< data.length; i1++ ){                 /////:))) bro chưa hoàn thành cập nhật r
                        for (String datas : data){                          ///// vì như này chỉ xóa dữ liệu trong cái data thoi
                            if (data[i].equals(datas)){                     /// chưa xóa trong text:)) mà bro lấy dữ liệu từ text ra
                                data[i] = null;                             ///=>>>> coi như là chưa có gì xảy ra cả, ta thu được 1 mảng trống rỗng
                            }                                               //
                        }
                    }
                    System.out.println("Hoàn tất cập nhật!");               ////// bro nếu muốn đơn giản hơn nữa thì thay cái true ->> false ở write
                    System.out.println("Enter 3 để quay về giao diện admin");///coi như mình @overdrive cái text :))))
                    nhap_Lua_Chon = scanner.nextInt();
                break;
                default:
                    nhap_Lua_Chon=3;
            }

        }while(nhap_Lua_Chon!=3);

    }
    void writeToFile() throws IOException {
        inforEstate iE = new inforEstate();
        String url = "https://batdongsan.com.vn/nha-dat-ban-ha-noi/";
        List<String> linkArray= iE.listLink(url);
        FileWriter fileWriter = null;
        BufferedWriter bufferedWriter = null;
        try {
            fileWriter = new FileWriter("src/databasefromlink", true);
            bufferedWriter = new BufferedWriter(fileWriter);
            for (int i = 0; i < linkArray.size(); i++) {
                bufferedWriter.write(iE.parserclone(linkArray.get(i)).toString());
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
