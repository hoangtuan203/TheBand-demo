package OOP.KeThua;

import java.util.Scanner;

public class diaChi{
    public String soNha,tenDuong,tenHuyen,tenTinh;
    public diaChi(){
        soNha=tenDuong=tenHuyen=tenTinh="";
    }
    public diaChi(String soNha,String tenDuong,String tenHuyen,String tenTinh){
            this.soNha=soNha;
            this.tenDuong=tenDuong;
            this.tenHuyen=tenHuyen;
            this.tenTinh=tenTinh;
    }
    public String getSoNha(){
        return soNha;
    }
    public void setSoNha(String soNha){
        this.soNha=soNha;
    }
    public String getTenDuong(){
        return tenDuong;
    }
    public void setTenDuong(String tenDuong){
        this.tenDuong=tenDuong;
    }
    public String getTenHuyen(){
        return tenHuyen;
    }
    public void setTenHuyen(String tenHuyen){
        this.tenHuyen=tenHuyen;
    }
    public String getTenTinh(){
        return tenTinh;
    }
    public void setTenTinh(String tenTinh){
        this.tenTinh=tenTinh;
    }
    public void nhapDiaChi(){
        Scanner sc= new Scanner(System.in);
        System.out.println("nhap so nha:");
        soNha=sc.nextLine();
        System.out.println("nhap ten duong:");
        tenDuong=sc.nextLine();
        System.out.println("nhap ten  huyen:");
        tenHuyen=sc.nextLine();
        System.out.println("nhap ten tinh:");
        tenTinh=sc.nextLine();
    }
    // public void xuatDiaChi(){
    //     System.out.println(soNha+"  "+tenDuong+"    "+tenHuyen+"    "+tenTinh);
    // }
}
