package OOP.Chuong_0;

import java.util.Scanner;

public class bai3 {
    static Scanner sc= new Scanner(System.in);
    private double r;
    public bai3(){
        this.r=0;
    }
    public bai3(double bk){
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
    public void chuVi(){
        System.out.println(Math.PI*2*r);
    }
    public void dienTich(){
        System.out.println(Math.PI*r*r);
    }
}
