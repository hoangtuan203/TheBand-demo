package OOP.DSSV;

import java.util.Scanner;
public class test {
    public static void main(String[] args) {
        DanhSachSinhVien ds= new DanhSachSinhVien(); 
        Scanner sc= new Scanner(System.in);
        int luachon=0;
        do {
            
            System.out.println("--------MENU--------");
            System.out.println("1.Nhap danh sach sinh vien");
            System.out.println("2.Xuat danh sach sinh vien");
            System.out.println("3.Tim kiem sinh vien theo ma sinh vien");
            System.out.println("4.Them sinh vien vao danh sach ");
            System.out.println("5.Thay doi so dien thoai");
            System.out.println("nhap lua chon:");
            luachon=sc.nextInt();
            sc.nextLine();
            if(luachon==1){
                ds.nhapDSSV();
            }
            else if(luachon==2){
                ds.xuatMangSV();
            }
            else if(luachon==3){
                ds.timKiemSV();
            }
            else if(luachon==4){
                ds.themSinhVien();
            }
            else if(luachon==5){
                ds.thayDoiSDT();
            }
        } while (luachon!=0);
    }
}
