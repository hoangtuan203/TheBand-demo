package exception;

import java.util.Scanner;

public class TestMyException {
    public static void nhap() throws MyException{
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap vao ho va ten:");
        String name  = sc.nextLine();
        System.out.println("nhap vao tuoi:");
        int tuoi = sc.nextInt();
        if(tuoi < 0){
            throw new MyException("tuoi nho hon 0");
        }
        if(tuoi < 2)
        {
            throw new MyException("tuoi nho hon 2");
        }
    }
    static int chia(int a,int b) throws MyException
    {
        if(b==0){
            throw new MyException();
        }
        return a/b;
    }
    static void nhap2So() throws MyException{
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap vao a:");
        int a= sc.nextInt(); 
        System.out.println("nhap vao b:");
        int b= sc.nextInt();
        System.out.println("chia 2 so :"+chia(a,b));
    }

    public static void kiemTra(){
        try {
            nhap2So();
        } catch (MyException ex) {
            System.out.println(ex.dividebyzero());
        }
    }
    public static void main(String[] args) {
        try {
            nhap();
        } catch (MyException e) {
            System.out.println("Loi :"+e.getMessage());
        }
        kiemTra();
    }
}
