package BT_OOP;

import java.text.NumberFormat;
import java.util.Scanner;

public class account {
    private long soTK;
    private String tenTK;
    private double soTienTK;
    Scanner sc = new Scanner(System.in);
    // contructor rong
    account(){
    }
    account(long so,String name,double soTien){
        this.soTK=so;
        this.tenTK=name;
        this.soTienTK=soTien;
    }
    public long getSoTK(){
        return this.soTK;
    }
    public void setSoTK(long so){
        this.soTK=so;
    }
    public String getTenTK(){
        return this.tenTK;
    }
    public void setTenTk(String name){
        this.tenTK=name;
    }
    public double getSoTien(){
        return this.soTienTK;
    }
    public void setSoTien(double soTien){
        this.soTienTK=soTien;
    }
    @Override
    public String toString() {
        // TODO Auto-generated method stub
        NumberFormat currency = NumberFormat.getCurrencyInstance();
        String str1 = currency.format(soTienTK);
        return soTK + "-" + tenTK + "-" + str1;
    }
    public double napTien(){
        double nap;
        nap= sc.nextDouble();
        if(nap >=0){
            soTienTK+=nap;
            NumberFormat currencyEN= NumberFormat.getCurrencyInstance();
            String str1= currencyEN.format(nap);
            System.out.println("ban vua nap "+ str1+" vao tai khoan !");
        }
        else{
            System.out.println("so tien nap vao khong hop le !");
        }
        return nap;
    }
    //
    public double rutTien(){
        double lePhi=5;
        double rut;
        System.out.println("nhap so tien muon rut:");
        rut=sc.nextDouble();
        if(rut <= (soTienTK - lePhi)){
            soTienTK-=(rut+ lePhi);
            NumberFormat currencyEN = NumberFormat.getCurrencyInstance();
            String str1 = currencyEN.format(rut);
            System.out.println("ban vua rut :"+str1+"Đ từ tài khoản.Phí là 5$ !");
        }
        else {
            System.out.println("so tien muon rut khong hop le !");
        }
        return rut;
    }
    public double daoHan(){
        double laiSuat=0.035;
        soTienTK=soTienTK + soTienTK*laiSuat;
        NumberFormat currencyEn = NumberFormat.getNumberInstance();
        String str1= currencyEn.format(soTienTK);
        System.out.println("ban vua nhan duoc :"+ str1+" tu dao han 1 thang !");
        return soTienTK;
    }
    void inTK(){
        NumberFormat currency = NumberFormat.getNumberInstance();
        String str1= currency.format(soTienTK);
        System.out.printf("%-10d %-20s %-20s",soTK,tenTK,str1);
    }
};
