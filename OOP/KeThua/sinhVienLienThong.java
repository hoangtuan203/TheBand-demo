package OOP.KeThua;

import java.util.Scanner;
public class sinhVienLienThong extends sinhVien{
    private String trinhdo;
    private String bangtotnghiep;
    public String getTrinhdo() {
        return trinhdo;
    }

    public void setTrinhdo(String trinhdo) {
        this.trinhdo = trinhdo;
    }

    public String getBangtotnghiep() {
        return bangtotnghiep;
    }

    public void setBangtotnghiep(String bangtotnghiep) {
        this.bangtotnghiep = bangtotnghiep;
    }
    Scanner sc=new Scanner(System.in);
    public sinhVienLienThong(){
       super();
       trinhdo=null;
       bangtotnghiep=null;
    }  
    public sinhVienLienThong(String masv, String hoten, String namSinh,String sdt, diaChi dc, String nh,String trinhdo, String bangtn) {
       super(masv, hoten, sdt, namSinh, dc,nh);
       this.trinhdo=trinhdo;
       this.bangtotnghiep=bangtn;
    }
    public void nhap()
    {
        super.nhapsinhvien();
        System.out.println("nhap vao trinh do:");
        trinhdo=sc.nextLine();
        System.out.println("nhap bang tot nghiep:");
        bangtotnghiep=sc.nextLine();
    }
    public void xuat()
    {
      System.out.println("Sinh vien lien thong :");
      System.out.printf("%-12s %-12s %-12s %-12s %-12s %-12s %-12s %-12s %-12s %-12s %-12s",getMasv(),getTen(),getNS(),dc.getSoNha(),dc.getTenDuong(),dc.getTenHuyen(),dc.getTenTinh(),getNoiHoc(),trinhdo,bangtotnghiep);
    }
    public static void main(String[] args) {
      sinhVienLienThong svlt= new sinhVienLienThong();
      svlt.nhap();
      svlt.xuat();
    }
}