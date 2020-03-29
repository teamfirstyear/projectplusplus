package coding;
import coding.bdsan;

import java.util.List;

public interface chucnang {
    


    void writeToFile(); ////truyền vào ham này sẽ là một đối tượng bds

    List<bdsan> answerRequest (String request);             ///// hàm này sẽ đọc data từ databasefromlink.txt
                                                            ///trả về 1 list<bdsan>
    ////----------------Nghĩa làm phần này--------------/////



    ///////---------------Minh Anh làm phần này----------////

    void writeReceipt();///// sau khi user nhập iD bất động sản muốn mua
                        //// lấy dữ liệu bất động sản đó + nhập thông tin user=> in vào receipt


}
