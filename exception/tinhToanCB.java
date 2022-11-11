package exception;

import java.util.Scanner;

public class tinhToanCB {
    private int a,b;
    Scanner sc = new Scanner(System.in);
    public tinhToanCB()
    {

    }
    public void nhap(){
        System.out.println("nhap vao so a:");
         a = sc.nextInt();
        System.out.println("nhap vao so b:");
         b = sc.nextInt();
    }
    public float thuong(int a,int b){
        return a/b;
    }
    public void xulyloi(){
        boolean loi;
        do{
            loi = false;
            nhap();
            float kq= 0;
        try{
            kq = thuong(a, b);
            System.out.println("ket qua:"+kq);
            
            int a[] = {1,2,3,4,5,6};
            System.out.println("nhap vi tri cua mang:");
            int i=sc.nextInt();
            System.out.println("a[i] ="+ a[i]);
        }
        catch(ArithmeticException e){
            loi =true;
            System.out.println("loi phep toan"+e.toString());
        }
        catch(ArrayIndexOutOfBoundsException e){
            loi = true;
            System.out.println("chi so vuot qua phan tu cua mang");
        }
        catch(Exception e){
        }
    }while(loi ==true);
    }
    public int tong(){
        return a+b;
    }
    public static void main(String[] args) {
        tinhToanCB pt = new tinhToanCB();
        pt.xulyloi();
        System.out.println("tong 2 so :"+pt.tong());
    }
}
