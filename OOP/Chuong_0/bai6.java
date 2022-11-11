package OOP.Chuong_0;

import java.util.Scanner;
public class bai6{
    Scanner sc= new Scanner(System.in);
    private int n;
    public bai6(){
        this.n=0;
    }
    public bai6(int n){
        this.n=n;
    }
    public int getN(){
        return n;
    }
    public void setN(int n){
        this.n=n;
    }
    public void nhap(){
        do {
            System.out.println("nhap so nguyen n:");
            n=sc.nextInt();
        } while (n<0);
    }
    public boolean kiemTraSNT() {
    if (n <= 1) {
        return false;
    }
    for (int i = 2; i <= Math.sqrt(n); i++) {
        if (n % i == 0) {
            return false;
        }
    }
    return true;
    }
    public void xuat(){
        if(kiemTraSNT()){
            System.out.println(n+" la so nguyen to!");
        }
        else{
            System.out.println(n+ " khong la so nguyen to");
        }
    }
}
