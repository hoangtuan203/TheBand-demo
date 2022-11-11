package OOP.Chuong_0;

import java.util.Scanner;
public class test{
    static Scanner sc= new Scanner(System.in);
    public void menu(){
        System.out.println("------MENU-------");
        System.out.println("cau 1 :");
        System.out.println("cau 2 :");
        System.out.println("cau 3 :");
        System.out.println("cau 4 :");
        System.out.println("cau 5 :");
        System.out.println("cau 6 :");
        System.out.println("cau 7 :");
        System.out.println("cau 8 :");
        System.out.println("cau 9 :");
    }
    public static void main(String[] args) {
        
        int luachon=0;
        test t= new test();
        t.menu();
        System.out.println("nhap lua chon:");
        luachon=sc.nextInt();
        switch (luachon) {
            case 1:
                bai1 b1= new bai1();
                b1.nhap();
                b1.tong();
                b1.tru();
                b1.nhan();
                b1.chia();
                break;
            case 2:
                bai2 b2= new bai2();
                b2.nhap();
                b2.perimeter();
                b2.area();
            case 3:
                bai3 ht= new bai3();
                ht.nhap();
                ht.chuVi();
                ht.dienTich();
            case 4:
                bai4 ktr=new bai4();
                ktr.nhap();
                ktr.kiemTra();
            case 5:
                bai5 ktra= new bai5();
                ktra.nhap();
                ktra.kiemTraSoNguyen();
            case 6:
                bai6 ktra1= new bai6();
                ktra1.nhap();
                ktra1.kiemTraSNT();
                ktra1.xuat();
            case 7:
                bai7 tong=new bai7();
                tong.nhap();
                tong.bai7a();
                tong.bai7b();
                tong.bai7c();
                tong.bai7d();
                tong.bai7e();
            case 8:
                bai8 b8= new bai8();
                b8.main();
            case 9:
                bai9 b9=new bai9();
                b9.nhap();
                b9.length();
                b9.xoaKhoangTrang();
                b9.demTu();
                b9.caud();
                b9.catChuoi();

            default:
                break;
        }
    }
}