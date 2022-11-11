package OOP.Chuong_0;

import java.util.Scanner;

public class bai9 {
    private String s;
    private int k, n;
    static Scanner sc= new Scanner(System.in);
    public bai9(){
        this.s="";
    }
    public bai9(String s){
        this.s=s;
    }
    public String getS(){
        return s;
    }
    public void setS(String s){
        this.s=s;
    }
    public void nhap(){
        System.out.println("nhap vao chuoi s:");
        s=sc.nextLine();
    }
    public void length(){
        System.out.println("do dai chuoi s:"+s.length());
    }
    public void xoaKhoangTrang(){
        System.out.println("chuoi ban dau:"+s);
        s=s.replaceAll(" ", "");// thay the khoang trang thanh ki tu rong
        System.out.println("chuoi sau khi xoa khoang trang :"+s);
    }
    public void demTu(){
        int count=0;
        char kiTu;
        String s1=s.concat(" "); // cộng thêm khoảng trắng vào cuối chuỗi
        for(int i=0;i<s1.length();i++){
            kiTu=s1.charAt(i);
            if(Character.isSpaceChar(kiTu)){
                //neu la khoang trang
                count++;
                System.out.println();    
            }
            else{
                System.out.print(kiTu);
            }
        }
        System.out.println();
        System.out.println("so tu:"+count);
    }
    public void caud(){
        System.out.println("Nhap gia tri k: ");
        k=sc.nextInt();
        System.out.println(k+" ki tu ben trai cua chuoi:");
        for(int i=0;i<k;i++){
            System.out.print(s.charAt(i));
        }
        System.out.print("\n");
        System.out.println(k+" ki tu ben phai cua chuoi:");
        int j=s.length()-2*k;
        for(int tmp=k+j;tmp<s.length();tmp++){
            System.out.print(s.charAt(tmp));
        }
        System.out.print("\n");
    }
    public void catChuoi()
    {
        System.out.println("nhap vi tri k va so luong tu n sau vi tri k:");
        k=sc.nextInt();
        n=sc.nextInt();
        String s1=s.substring(k,n+k);
        System.out.println("chuoi sau khi cat ra:"+s1);
    }
    
   
}

