package OOP.DSSV;

import java.util.Arrays;
import java.util.Scanner;

public class DanhSachSinhVien  {
    private int n;
    private SinhVien[] arr;
    Scanner sc=new Scanner(System.in);
    public DanhSachSinhVien(){
        arr=null;
        n=0;
    }
    public void nhapDSSV(){
        System.out.println("nhap vao so luong sinh vien:");
        n=Integer.parseInt(sc.nextLine());
        arr=new SinhVien[n];
        for(int i=0;i<n;i++){
            System.out.println("nhap sinh vien thu "+(i+1)+":");
            arr[i]= new SinhVien();
            arr[i].nhapsinhvien();
        }
    }
    public void xuatMangSV(){
        System.out.println("Danh sach sinh vien:");
        System.out.printf("%-12s%-20s%-12s%-20s%-12s\n","MaSV","Ho va Ten","Ngay sinh","Dia Chi", "Dien Thoai");
        for (SinhVien sinhVien : arr) {
            sinhVien.xuatsinhvien();
        }
    }
    // tim kiem sinh vien theo ma sinh vien
    public void timKiemSV(){
        System.out.println("nhap masv can tim:");
        String masv=sc.nextLine();
        for (SinhVien sinhVien : arr) {
            sinhVien.getMasv().equalsIgnoreCase(masv);
            sinhVien.xuatsinhvien();
        }
    }
    public void themSinhVien(){
        System.out.println("nhap thong tin sinh vien can them:");
        SinhVien sv=new SinhVien();
        sv.nhapsinhvien();
        arr=Arrays.copyOf(arr,arr.length+1);
        arr[n]=sv;
        n++;
    }
    public void thayDoiSDT(){
        System.out.println("nhap so dien thoai muon doi:");
        String sdt=sc.nextLine();
        SinhVien.setDienthoai(sdt);
    }

}
