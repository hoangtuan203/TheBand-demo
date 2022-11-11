package OOP.Chuong_2;

import java.util.Scanner;

public class HCN{
    Scanner sc = new Scanner(System.in);
    protected double dai,rong;
    public HCN(){
        this.dai=0;
        this.rong=0;
    }
    public HCN(double dai,double rong){
        this.dai=dai;
        this.rong=rong;
    }
    public void nhap(){
        System.out.println("nhap chieu dai:");
        dai=sc.nextDouble();
        System.out.println("nhap chieu rong:");
        rong= sc.nextDouble();
    }
    public void hienThi() {
        System.out.println("chieu dai va chieu rong la: "
                + dai+ " và " + rong);
    }
    public void chuVi(){
        System.out.println("chu vi la:"+(dai+rong)/2);
    }
    public void dienTich(){
       System.out.println("dien tich la:"+dai*rong);
    }
    public static void main(String[] args) {
        HCN hcn1= new HCN();
        hcn1.nhap();
        hcn1.hienThi();
        hcn1.chuVi();
        hcn1.dienTich();
    }
}