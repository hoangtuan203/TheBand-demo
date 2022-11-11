package OOP.Chuong_0;

import java.util.Scanner;

public class bai4 {
    Scanner sc = new Scanner(System.in);
    private int n;
    public bai4(){
        this.n=0;
    }
    public void nhap(){
        do {
            System.out.println("nhap so tu nhien n:");
            n=sc.nextInt();
        } while (n<0);
    }
    public bai4(int n){
        this.n=n;
    }
    public int getN(){
        return n;
    }
    public void setN(int n){
        this.n=n;
    }
    public void kiemTra(){
        if(n%2==0)  {
            System.out.println(n+" la so chan!");
        }
        else System.out.println(n+" la so le !");
    }
}
