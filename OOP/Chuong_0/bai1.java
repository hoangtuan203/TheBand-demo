package OOP.Chuong_0;

import java.util.Scanner;

public class bai1 {
    static Scanner sc = new Scanner(System.in);
    private int a,b;
    public void nhap(){
        a=sc.nextInt();
        b=sc.nextInt();
    }
    public bai1(){
        this.a=this.b=0;
    }
    public bai1(int a,int b){
        this.a=a;
        this.b=b;
    }
    public void setA(int a){
        this.a=a;
    }
    public void setB(int b){
        this.b=b;
    }
    public int getA(){
        return a;
    }
    public int getB(){
        return b;
    }
    public void tong(){
        System.out.println(a+"+"+b+"="+(a+b));
    }
    public void tru(){
        System.out.println(a+"-"+b+"="+(a-b));
    }
    public void nhan(){
        System.out.println(a+"*"+b+"="+(a*b));
    }
    public void chia(){
        System.out.println(a+"/"+b+"="+(a*1.0/b));
    }
    public static void main(String[] args) {
        bai1 vd= new bai1();
        vd.nhap();;
        vd.tong();
        vd.tru();
        vd.nhan();
        vd.chia();
    }
}
