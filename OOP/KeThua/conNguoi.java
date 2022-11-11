package OOP.KeThua;

import java.util.Scanner;

public class conNguoi {
    protected String ten,namSinh,sdt;
    protected diaChi dc;
    public conNguoi(){
        ten=namSinh=sdt="";
        dc=new diaChi();
    }
    public conNguoi(String ten ,String sdt,String namSinh,diaChi dc){
        this.ten=ten;
        this.sdt=sdt;
        this.namSinh=namSinh;
        this.dc=dc;
    }
    public String getTen(){
        return ten;
    }
    public String getSDT(){
        return sdt;
    }
    public String getNS(){
        return namSinh;
    }
    public void setTen(String ten){
        this.ten=ten;
    }
    public void setSDT(String sdt){
        this.sdt=sdt;
    }
    public void setNS(String ns){
        this.namSinh=ns;
    }
    public diaChi getDC(){
        return dc;
    }
    public void setDC(diaChi dc){
        this.dc=dc;
    }
    public void nhapConNguoi(){
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap ho ten:");
        ten=sc.nextLine();
        System.out.println("nhap sdt:");
        sdt=sc.nextLine();
        System.out.println("nhap nam sinh:");
        namSinh=sc.nextLine();
        dc.nhapDiaChi();
    }
    // public void xuatConNguoi(){
    //     System.out.println("Họ tên   Giới tinh      SDT        Số nhà   Tên Đường      Tên Huyện       Tên Tỉnh");
    //     //System.out.printlf("%-12s %-10s %-15s %-12s %-12s %-12s %-12s",ten,gioiTinh,sdt,dc.getSoNha(),dc.getTenDuong(),dc.getTenHuyen(),dc.getTenTinh());
    // }
    public static void main(String[] args) {
        conNguoi cn= new conNguoi();
        cn.nhapConNguoi();
    }
}