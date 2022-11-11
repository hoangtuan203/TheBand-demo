package OOP.Chuong_0;

import java.util.Scanner;

public class bai5 {
    Scanner sc= new Scanner(System.in);
    private int n;
    public bai5(){
        this.n=0;
    }
    public bai5(int n){
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
            System.out.println("nhap so nguyen N:");
            n=sc.nextInt();
        } while (n<0);
    }
   public void kiemTraSoNguyen(){
        if(n>0)  {
            System.out.println(n+" la so duong!");
        }
        else if(n<0){
            System.out.println(n+" la so am !");
        } 
        else if(n==0)  {
            System.out.println(n+" la so zero");
        }
    }
}
