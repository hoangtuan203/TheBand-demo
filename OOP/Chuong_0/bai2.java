package OOP.Chuong_0;
import java.util.Scanner;
public class bai2{
    static Scanner sc= new Scanner(System.in);
    private double width,height;
    public bai2(){
        this.width=this.height=0;
    }
    public bai2(double width,double height){
        this.width=width;
        this.height=height;
    }
    public bai2(bai2 other){
        this.width=other.width;
        this.height=other.height;
    }
    public double getWidth(){
        return width;
    }
    public double getHeight(){
        return height;
    }
    public void setWidth(double rong){
        this.width=rong;
    }
    public void setHeight(double cao){
        this.height=cao;
    }
    public void nhap(){
        System.out.println("nhap chieu dai va chieu rong");
        width=sc.nextDouble();
        height=sc.nextDouble();
    }
    public void perimeter(){
        System.out.println("chu vi:"+(width+height)*2);
    }
    public void area(){
        System.out.println("dien tich:"+(width*height));
    }
    public static void main(String[] args) {
        //HCN hcn= new HCN();
        bai2 hcn1=new bai2(5,5);
        //hcn1.nhap();
        hcn1.perimeter();
        hcn1.area();
    }
}