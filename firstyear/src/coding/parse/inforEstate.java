package coding.parse;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import coding.bdsan;
import coding.func.ParserfromHtml;

import java.util.ArrayList;
import java.util.List;


/////bắt chước anh Kiểm:))))))////
public class inforEstate extends ParserfromHtml<bdsan> {
    @Override
    public bdsan parserclone(String url) {
        Document html = getHtmlcontent((url));
        bdsan result = new bdsan();
        String iD="";
        String day="";
        String district="";
        String value ="";
        String timesell ="";
        String phonenum ="";
        String status ="";
        String seller="";
        String directhome ="";
        String area ="";

        ////bắt đàu sợt///
        Element pros = html.selectFirst("div.kqchitiet");
        Elements child = pros.children();
        for (int i=0;i<child.size();i++){
            if(child.get(i).ownText().equals("Loại tin rao")){
                status = child.get(i+1).ownText();
            }
            if(child.get(i).ownText().equals("Địa chỉ")){
                district =child.get(i+1).ownText();
            }
            if(child.get(i).ownText().equals("Hướng nhà")){
                directhome= child.get(i+1).ownText();
            }
            if (child.get(i).ownText().equals("Tên liên lạc")){
                seller=child.get(i+1).ownText();
            }
            if(child.get(i).ownText().equals("Mobile")){
                phonenum =child.get(i+1).ownText();
            }
            if (child.get(i).ownText().equals("Mã tin đăng")){
                iD =child.get(i+1).ownText();
            }if (child.get(i).ownText().equals("Ngày đăng")){
                day=child.get(i+1).ownText();
            }


        }

        return result;
    }

    @Override
    public List<String> listLink(String url) {
        Document html =getHtmlcontent(url);
        Elements elements=html.select("h3");
        List<String> arrlink= new ArrayList<>();
        for (int i=0;i<elements.size();i++){
            Element element =elements.get(i);
            String link = element.select("a").attr("href");
            arrlink.add("https://batdongsan.com.vn/nha-dat-ban-ha-noi/"+link);
        }
        return arrlink;
    }

    private Document getHtmlcontent(String url){
        Document pageHtml;
        try {
            Connection.Response response = Jsoup.connect(url)
                    .userAgent("Mozilla/5.0 (Windows NT 10.0; WOW64) " +
                            "AppleWebKit/537.36 (KHTML, like Gecko) " +
                            "coc_coc_browser/85.0.134 Chrome/79.0.3945.134 Safari/537.36")
                    .referrer("http://www.google.com")
                    .followRedirects(true)
                    .timeout(30000)
                    .execute();
            pageHtml = response.parse();
            return pageHtml;
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        return null;
    }
}
