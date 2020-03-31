package coding.func;
import java.util.List;


    public abstract class ParserfromHtml<T> {
        public abstract List<String> listLink(String url);


        ////từ url trang chủ ->>> tạo ra 1 list url con


        public abstract T parserclone (String url);


        //* từ url sẽ tạo ra 1 đối tượng bds chứa thông tin *///
        ////dtuong bds nay sẽ dùng luôn lệnh writeToFile (trong Interactive)để in ra databasefromlink.txt///
        /// từ database -> in ra tùy ý

    }


