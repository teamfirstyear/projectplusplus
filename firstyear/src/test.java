import coding.bdsan;
import java.util.Scanner;
import coding.admin;
import coding.client;
public class test {
    public static final String password="teamfirstyear";
    public static void main(String[] args) {
        bdsan bdsan =new bdsan();
        Scanner sc =new Scanner(System.in);
        String url = "https://batdongsan.com.vn/nha-dat-ban-ha-noi";
        System.out.println("Xin chào, tôi là firstyearteam, người sẽ giúp bạn trong ngành bất động sản!");
        System.out.print("Xin cho biết bạn là admin hay là khách hàng: ");
        String bat_dau_Tuong_Tac=sc.nextLine();
        String finishpro ="";
        do {
            if (bat_dau_Tuong_Tac.trim().equalsIgnoreCase("admin")) {
                admin admin = new admin();
                admin.thaoTac_admin(bat_dau_Tuong_Tac);
                finishpro=sc.nextLine();
            } else if (bat_dau_Tuong_Tac.trim().equalsIgnoreCase("khách hàng")) {
                client client = new client();
                client.thao_Tac_client(bat_dau_Tuong_Tac);
                finishpro=sc.nextLine();
            }
        }while (!finishpro.equals("x"));
    }

}
