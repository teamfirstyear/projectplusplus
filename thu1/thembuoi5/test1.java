package thembuoi5;

import java.util.Scanner;

public class test1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so tai lieu trong thu vien: ");
        String num=sc.nextLine();
        int quant = Integer.valueOf(num);
        taiLieu[] taiLieus = new taiLieu[100];
        for(int i=0;i<quant;i++){
            System.out.println("nhap tai lieu thu "+(i+1));
            System.out.println("loại tài liệu với cú pháp : (sách/tạp chí/báo)");
            String type =sc.nextLine();
            if(type.trim().equals("sách")){
                taiLieus[i]= new sach();
                taiLieus[i].setType(type);
                taiLieus[i].themmoi();
            }else if(type.trim().equals("tạp chí")){
                taiLieus[i]=new tapChi();
                taiLieus[i].setType(type);
                taiLieus[i].themmoi();
            }else if(type.trim().equals("báo")){
                taiLieus[i]=new bao();
                taiLieus[i].setType(type);
                taiLieus[i].themmoi();
            }

        }
        /////////////////////////////////////////////////////////////////////////////////////////
        System.out.println("tương tác chương trình quản lý tài liệu ");
        System.out.println("nhập 1 để tìm tài liệu theo loại, " +
                            "nhập 2 để thêm tài liệu, " +
                            "nhập 3 để in ra thông tin , " +
                            "nhập 4 để xóa thông tin tài liệu , " +
                            "nhập 5 để out");

        String thaotac =sc.nextLine();
        int k=Integer.valueOf(thaotac);
        int them=0;
        while(k!=5){
            if(k==1){
                System.out.println("bạn muốn tìm loại nào: ");
                String search1=sc.nextLine();
                System.out.println("Tên "+search1+" bạn cần: ");
                String search2=sc.nextLine();
                for(int i=0;i<quant;i++){
                    taiLieus[i].timkiemtailieu(search1,search2);
                }
                System.out.println("nhập 1 để tìm tài liệu theo loại, " +
                        "nhập 2 để thêm tài liệu, " +
                        "nhập 3 để in ra thông tin , " +
                        "nhập 4 để xóa thông tin tài liệu , " +
                        "nhập 5 để out");
                k=sc.nextInt();sc.nextLine();
            }else if(k==2){
                System.out.println("ban muon them bao nhieu tai lieu: (dưới "+(101-quant)+ ")");
                them=sc.nextInt();sc.nextLine();
                for (int i= 0;i<them;i++){
                    System.out.println("nhap tai lieu thu "+(quant+i+1));
                    System.out.println("loại tài liệu với cú pháp : (sách/tạp chí/báo): ");
                    String typen =sc.nextLine();
                    if(typen.trim().equals("sách")){
                        taiLieus[quant+i]= new sach();
                        taiLieus[quant+i].setType(typen);
                        taiLieus[quant+i].themmoi();
                    }else if(typen.trim().equals("tạp chí")){
                        taiLieus[quant+i]=new tapChi();
                        taiLieus[quant+i].setType(typen);
                        taiLieus[quant+i].themmoi();
                    }else if(typen.trim().equals("báo")){
                        taiLieus[quant+i]=new bao();
                        taiLieus[quant+i].setType(typen);
                        taiLieus[quant+i].themmoi();
                    }
                }
                System.out.println("nhập 1 để tìm tài liệu theo loại, " +
                        "nhập 2 để thêm tài liệu, " +
                        "nhập 3 để in ra thông tin , " +
                        "nhập 4 để xóa thông tin tài liệu , " +
                        "nhập 5 để out");
                quant=quant+them;
                k=sc.nextInt();sc.nextLine();
            }else if(k==3){
                for(int i=0;i<quant;i++){
                    System.out.print((i+1)+". ");
                    if(taiLieus[i]!=null){
                        taiLieus[i].hienthi();
                    }
                }
                System.out.println("nhập 1 để tìm tài liệu theo loại, " +
                        "nhập 2 để thêm tài liệu, " +
                        "nhập 3 để in ra thông tin , " +
                        "nhập 4 để xóa thông tin tài liệu , " +
                        "nhập 5 để out");
                k=sc.nextInt();sc.nextLine();
            }else if(k==4){
                System.out.println("nhập mã tài liệu bạn muốn xóa");
                String remove=sc.nextLine();
                for(int i=0;i<quant;i++){
                    if(remove.equals(taiLieus[i].getCode())){
                        taiLieus[i]=taiLieus[i+1];
                        them=them-1;
                    }
                }
                quant=quant+them;

                System.out.println("nhập 1 để tìm tài liệu theo loại, " +
                        "nhập 2 để thêm tài liệu, " +
                        "nhập 3 để in ra thông tin , " +
                        "nhập 4 để xóa thông tin tài liệu , " +
                        "nhập 5 để out");
                k=sc.nextInt();sc.nextLine();
            }
        }
        System.out.println("Good bye!");

    }
}
