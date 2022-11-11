
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int luachon=0;
        int n;
        System.out.println("nhap so luong gia suc:");
        n=sc.nextInt();
        System.out.println("--Menu--");
        System.out.println("1.Bo");
        System.out.println("2.Cuu");
        System.out.println("3.De");
        System.out.println("nhap lua chon:");
        luachon=sc.nextInt();
        switch(luachon){
            case 1:
                giaSuc gs = new bo();
                danhSachGiaSuc dsgs = new danhSachGiaSuc();
                dsgs.sinhCon(null);
                
                
                break;
            default:
                System.out.println("nhap sai");
                break;
        }
    }
}
