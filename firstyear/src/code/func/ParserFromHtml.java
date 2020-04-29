package code.func;

import code.ob.Batdongsan;
import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.util.ArrayList;
import java.util.List;

public  class ParserFromHtml {

    public List<Batdongsan> WriteHTMLtoList(){
        List<Batdongsan> batdongsanList= new ArrayList<>();
        String url = "https://batdongsan.com.vn/nha-dat-ban-ha-noi/";
        List<String> linkArray = listLink(url);
        for (int i=0;i<linkArray.size();i++){
            batdongsanList.add(parserclone(linkArray.get(i)));
        }
        return batdongsanList;
    }
    public Batdongsan parserclone(String url){

        Document html = getHtmlcontent((url));
        Batdongsan result = new Batdongsan();
        String moreinf =html.selectFirst("div.prd-more-info").text();
        String[] giatitle =html.select("span.gia-title").text().split("Diện tích: ");

        String seller=html.select("div#LeftMainContent__productDetail_contactName.right-content").text().replace("Tên liên lạc ","").trim();

        String phonenum=html.select("div#LeftMainContent__productDetail_contactMobile.right-content").text().replace("Mobile ","").trim();
        String [] address =html.select("span.diadiem-title.mar-right-15").text().split(" tại ");
        String addresss =address[1];
        String status =html.selectFirst("div.right").text();
        String value =giatitle[0].replace("Giá: ","");
        String area =giatitle[1];

        String iD =moreinf.substring(13,21);
        String day=moreinf.substring(70,80);
        if(seller.contains("Bất Động Sản")){
            seller=seller.replace("Bất Động Sản","BĐS");
        }
        if(phonenum.contains("_")){
            phonenum=phonenum.replace("_","");
        }

        result.setArea(area);
        result.setDay(day);
        result.setAddress(addresss);
        result.setiD(iD);
        result.setPhonenum(phonenum);
        result.setSeller(seller);
        result.setStatus(status);
        result.setValue(value);


        return result;
    }
    public List<String> listLink(String url) {
        Document html =getHtmlcontent(url);
        Elements elements=html.select("h3");
        List<String> arrlink= new ArrayList<>();
        for (int i=0;i<20;i++){
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
