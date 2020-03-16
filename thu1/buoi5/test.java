package buoi5;

import java.util.Scanner;

public class test {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" nhập số người sẽ có trong danh sách cán bộ (nhỏ hơn 10 người): ");
        String num = sc.nextLine();
        int quant = Integer.parseInt(num);
        canBo[] canBos = new canBo[10];
        for (int i = 0; i < quant; i++) {
            System.out.println("nhap du lieu can bo: " + (i + 1));
            System.out.print("nhap chuc vu: (kỹ sư/công nhân/nhân viên): ");
            String chucvu = sc.nextLine();
            if (chucvu.equals("kỹ sư")) {
                canBos[i] = new kySu();
                canBos[i].setChucvu(chucvu);
                canBos[i].themcanbo();
            } else if (chucvu.equals("nhân viên")) {
                canBos[i] = new nhanVien();
                canBos[i].setChucvu(chucvu);
                canBos[i].themcanbo();
            } else if(chucvu.equals("công nhân")){
                canBos[i] = new congNhan();
                canBos[i].setChucvu(chucvu);
                canBos[i].themcanbo();

            }
        }

        //////////////////////////////////////////////////////////////////////////////////////////////
        System.out.println("Tương tác: ");
        System.out.println("nhập 1 để tìm hồ sơ theo tên, nhập 2 để thêm cán bộ, nhập 3 để in ra danh sách, nhập 4 để out");
        String thaotac = sc.nextLine();
        int them = 0;
        while (Integer.parseInt(thaotac) != 4) {
            if (Integer.parseInt(thaotac) == 1) {
                System.out.println(" tìm thông tin người tên: ");
                String search = sc.nextLine();
                System.out.println("Finding");
                for (int i = 0; i < (quant); i++) {
                    canBos[i].timkiemten(search);
                }
                System.out.println("nhập 1 để tìm hồ sơ theo tên, nhập 2 để thêm cán bộ, nhập 3 để in ra danh sách, nhập 4 để out");
                thaotac = sc.nextLine();

            } else if (Integer.parseInt(thaotac) == 2) {
                System.out.println("ban muon them bao nhieu nguoi ( dưới " + (10 - quant+1) + " ): ");
                them = sc.nextInt();
                sc.nextLine();
                for (int i = 0; i < them; i++) {
                    System.out.println("nhap du lieu can bo: " + (quant + i + 1));
                    System.out.print("nhap chuc vu: (kỹ sư/công nhân/nhân viên): ");
                    String chucvumoi = sc.nextLine();
                    if (chucvumoi.equals("kỹ sư")) {
                        canBos[quant + i] = new kySu();
                        canBos[quant + i].setChucvu(chucvumoi);
                        canBos[quant + i].themcanbo();
                    } else if (chucvumoi.equals("nhân viên")) {
                        canBos[quant + i] = new nhanVien();
                        canBos[quant + i].setChucvu(chucvumoi);
                        canBos[quant + i].themcanbo();
                    } else if(chucvumoi.equals("công nhân")){
                        canBos[quant + i] = new congNhan();
                        canBos[quant + i].setChucvu(chucvumoi);
                        canBos[quant + i].themcanbo();
                    }


                }
                quant = quant + them;
                System.out.println("nhập 1 để tìm hồ sơ theo tên, nhập 2 để thêm cán bộ, nhập 3 để in ra danh sách, nhập 4 để out");
                thaotac = sc.nextLine();

            } else {
                for (int i = 0; i < (quant); i++) {
                    System.out.print((i + 1) + ". ");
                    canBos[i].inra();
                }
                System.out.println("nhập 1 để tìm hồ sơ theo tên, nhập 2 để thêm cán bộ, nhập 3 để in ra danh sách, nhập 4 để out");
                thaotac = sc.nextLine();
            }
        }
        System.out.println("Good bye!");


    }
}








