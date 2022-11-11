package OOP.Chuong_2;

import java.util.Scanner;

public class HT {
    static Scanner sc= new Scanner(System.in);
    private double r;
    public HT(){
        this.r=0;
    }
    public HT(double bk){
        this.r=bk;
    }
    public double getR(){
        return r;
    }
    public void setR(double bk){
        this.r=bk;
    }
    public void nhap(){
        System.out.println("nhap ban kinh r:");
        r=sc.nextDouble();
    }
    public void xuat(){
        System.out.println("ban kinh vua nhap:"+r);
    }
    public void chuVi(){
        System.out.println(Math.PI*2*r);
    }
    public void dienTich(){
        System.out.println(Math.PI*r*r);
    }
}
