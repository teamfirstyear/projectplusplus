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
        String finishpro ="";
        do {
            System.out.print("Xin cho biết bạn là admin hay là khách hàng: ");
            String bat_dau_Tuong_Tac=sc.nextLine();
            if (bat_dau_Tuong_Tac.trim().equalsIgnoreCase("admin")) {
                String inpass ="";
                do {
                    System.out.println("password :");
                     inpass =sc.nextLine();
                }while(!inpass.equals(password));
                admin admin = new admin();
                admin.thaoTac_admin();
            } else if (bat_dau_Tuong_Tac.trim().equalsIgnoreCase("khách hàng")) {
                client client = new client();
                client.thao_Tac_client();
            }
            System.out.print("Kết thúc chương trình bằng \"x\", ");
            System.out.println("Ấn bất kì phím khác để tiếp tục chương trình");
            finishpro=sc.nextLine();
        }while (!finishpro.equals("x"));
    }

}
