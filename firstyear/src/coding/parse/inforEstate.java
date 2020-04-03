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
        String moreinf =html.selectFirst("div.prd-more-info").text();
        String[] giatitle =html.select("span.gia-title").text().split("Diện tích: ");

        String seller=html.select("div#LeftMainContent__productDetail_contactName.right-content").text().replace("Tên liên lạc ","");

        String phonenum=html.select("div#LeftMainContent__productDetail_contactMobile.right-content").text().replace("Mobile ","");
        String directhome =html.select("div.LeftMainContent__productDetail_direction.row").text();
        String [] address =html.select("span.diadiem-title.mar-right-15").text().split(" tại ");
        String district =address[1];
        String status =html.selectFirst("div.right").text();
        String value =giatitle[0].replace("Giá: ","");
        String area =giatitle[1];

        String iD =moreinf.substring(13,21);
        String day=moreinf.substring(70,80);


        result.setArea(area);
        result.setDay(day);
        result.setDirecthome(directhome);
        result.setDistrict(district);
        result.setiD(iD);
        result.setPhonenum(phonenum);
        result.setSeller(seller);
        result.setStatus(status);
        result.setValue(value);


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
