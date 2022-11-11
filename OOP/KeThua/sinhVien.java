package OOP.KeThua;

import java.util.Scanner;
public class sinhVien extends conNguoi{
    private String masv,noihoc;
    Scanner sc=new Scanner(System.in);
    public sinhVien()
    {
       super();
       masv=null;
       noihoc=null;
    }
    public sinhVien(String masv,String hoTen,String sdt,String namSinh,diaChi dc,String nh){
        super(hoTen, sdt, namSinh, dc);
        this.masv=masv;
        this.noihoc=nh;
    }
    public void setMasv(String masv) {
        this.masv = masv;
    }
    public String getMasv() {
        return masv;
    }
    public String getNoiHoc(){
        return noihoc;
    }
    public void setNoiHoc(String noiHoc){
        this.noihoc=noiHoc;
    }
    public void nhapsinhvien()
    {
        sinhVien sv= new sinhVien();
        sv.nhapConNguoi(); 
        System.out.println("Nhap ma sv:");
        masv=sc.nextLine();
        System.out.println("nhap noi hoc:");
        noihoc=sc.nextLine();
    }
    public void xuatsinhvien()
    {
        System.out.printf("%-12s %-20s %-12s %-20s %-12s\n",masv,ten,namSinh,sdt,dc,noihoc);
       //System.out.println(masv +"\t"+ hoten+"\t\t");
    }  
}

