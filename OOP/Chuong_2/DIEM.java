package OOP.Chuong_2;

import java.util.Scanner;

public class DIEM {
    static Scanner sc=new Scanner(System.in);
    private double x;
    private double y;
    public DIEM(){
        this.x=0;
        this.y=0;
    }    
    public DIEM(double x, double y){
        this.x=x;
        this.y=y;
    }
    public double getX(){
        return x;
    }
    public double getY(){
        return y;
    }
    public void setX(double x){
        this.x=x;
    }
    public void setY(double y){
        this.y=y;
    }
    public String toString(){
        return (this.x +" "+ this.y);
    }
    public void nhap(){
        System.out.println("nhap toa do x:");
        setX(sc.nextDouble());
        System.out.println("nhap toa do y:");
        setY(sc.nextDouble());
    }
    public void xuat(){
        System.out.println("toa do cua diem la:"+toString());
    }
    public void move(){
        System.out.println("nhap toa do x va y can di chuyen:");
        double dx=sc.nextDouble();
        double dy=sc.nextDouble();
        x+=dx;
        y+=dy;
    }
    public static void main(String[] args) {
        DIEM d1= new DIEM();
        d1.nhap();
        d1.xuat();
        d1.move();
        System.out.println("diem sau khi di chuyen:");
        d1.xuat();
    }
}
