package code.ob;


import code.func.ParserFromHtml;
import code.func.WorkWithList;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Admin extends WorkWithList {
    private static final String passwordAdmin ="teamfirstyear";
    //private List<Batdongsan> batdongsanList;
    private Scanner sc=new Scanner(System.in);

    public void SetListfromHTML(){
        ParserFromHtml parser=new ParserFromHtml();
        setBatdongsanList(parser.WriteHTMLtoList());
    }


    @Override
    public List<Batdongsan> getBatdongsanList() {
        return super.getBatdongsanList();
    }

    @Override
    public void setBatdongsanList(List<Batdongsan> batdongsanList) {
        super.setBatdongsanList(batdongsanList);
    }

    @Override
    public List<Batdongsan> ReadFileToList() throws Exception {
        return super.ReadFileToList();
    }

    @Override
    public void Write_ListToFile(List<Batdongsan> batdongsanList) throws Exception {
        super.Write_ListToFile(batdongsanList);
    }

    @Override
    public void showList(List<Batdongsan> batdongsanList) {
        super.showList(batdongsanList);
    }

    public void AdminWork()  {
        System.out.println("Chào teamfirstyear! ");
        int choice=0;
        List<Batdongsan> batdongsanList = new ArrayList<>() ;
        do {
            System.out.println("Nhập 1 để nạp dữ liệu \\n Nhập 2 để hiển thị dữ liệu \\n Nhập 3 để thoát");
            choice=sc.nextInt();
            sc.nextLine();
            switch (choice){
                case 1:
                    try {
                        SetListfromHTML();
                        Write_ListToFile(getBatdongsanList());
                    }catch (Exception e){
                        System.out.println("Cần fix "+e);
                    }
                    finally {
                        System.out.println("Đã nạp xong!!");
                    }
                break;
                case 2:
                    System.out.println("Hiển thị dữ liệu: ");
                    try{

                        if(getBatdongsanList()==null && ReadFileToList().size()==0){
                            System.out.println("WARNING!! Cần nạp dữ liệu vì Data  còn trống");
                        }else{
                            batdongsanList=ReadFileToList();
                            showList(batdongsanList);
                        }

                    }catch (Exception e){
                        System.out.println(e);
                    }finally {
                        System.out.println("Đẫ hiển thị! ");
                    }
                 break;
                default:

                    choice=3;
            }
        }while(choice!=3);

    }
    public void xacthuc()  {
        int timesLog =0;
        String password="";
        do{
            System.out.println("Bạn còn "+(3-timesLog)+" lần nhập mật khẩu");
            System.out.println("Nhập password: ");
            password=sc.nextLine();
            timesLog++;
        }while(!password.equals(passwordAdmin)&&timesLog!=3);
        if (timesLog==3){
            System.out.println("bạn không cơ hội ");
        }else{
            AdminWork();
        }
    }
}
