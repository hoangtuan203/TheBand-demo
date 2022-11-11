
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class danhSachGiaSuc {
    int n;
    private giaSuc[] arr;
    Scanner sc= new Scanner(System.in);
    public danhSachGiaSuc(){
        arr=null;
        n=0;
    }
    public void sinhCon(giaSuc g){
        if(g instanceof bo){
            Random b= new Random();
            int sl=b.nextInt(5)+1;
            for(int i=0;i<sl;i++){
                arr[i]=new bo();
            }
            System.out.println("so con bo sinh ra :"+sl);
        }
        if(g instanceof cuu){
            Random c= new Random();
            int sl=c.nextInt(5)+1;
            for(int i=0;i<sl;i++){
                arr[i] = new cuu();
            }
            System.out.println("so con cuu sinh ra :"+sl);
        }
        if(g instanceof de){
            Random d= new Random();
            int sl=d.nextInt(5)+1;
            for(int i=0;i<sl;i++){
                arr[i]=new de();
            }
            System.out.println("so con de sinh ra :"+sl);
            
        }
    }
    public void choSua(giaSuc g){
        if(g instanceof bo){
            Random b=new Random();
            int sua=b.nextInt(0,20);
            System.out.println("so lit sua cua bo :"+sua);
        }
        if(g instanceof cuu){
            Random c=new Random();
            int sua=c.nextInt(0,5);
            System.out.println("so lit sua cua cuu :"+sua);
        }
        if(g instanceof de){
            Random d=new Random();
            int sua=d.nextInt(0,10);
            System.out.println("so lit sua cua de :"+sua);
        }
    }
    public void nhapDSGS(){
        System.out.println("nhap so luong gia suc:");
        n=Integer.parseInt(sc.nextLine());
        arr= new giaSuc[n];
        for(int i=0;i<n;i++){
            arr[i] = new giaSuc();
        }
    }
    private ArrayList<giaSuc> danhSach = new ArrayList<giaSuc>() ;
    public danhSachGiaSuc(ArrayList<giaSuc> danhSach){
        this.danhSach=danhSach;
    }
    public void them(giaSuc ds){
        this.danhSach.add(ds);
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int luachon=0;
        System.out.println("--Menu--");
        System.out.println("1.Bo");
        System.out.println("2.Cuu");
        System.out.println("3.De");
        System.out.println("nhap lua chon:");
        luachon=sc.nextInt();
        
        switch(luachon){
            case 1:
                giaSuc gs1 = new bo();
                danhSachGiaSuc ds1 = new danhSachGiaSuc();
                ds1.nhapDSGS();
                ds1.choSua(gs1);
                ds1.sinhCon(gs1);
                break;
            case 2:
                giaSuc gs2 = new cuu();
                danhSachGiaSuc ds2 = new danhSachGiaSuc();
                ds2.nhapDSGS();
                ds2.choSua(gs2);
                break;
            case 3:
                giaSuc gs3 = new bo();
                danhSachGiaSuc ds3 = new danhSachGiaSuc();
                ds3.nhapDSGS();
                ds3.choSua(gs3);
                break;
            default:
                System.out.println("nhap sai");
                break;
        }

    }
}
