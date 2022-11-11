package BT_OOP;

import java.util.Scanner;

public class main {
    static Scanner sc = new Scanner(System.in);
    static void nhapTK(account tk){
        System.out.println("nhap so tai khoan :");
        tk.setSoTK(sc.nextInt());
        sc.nextLine();
        System.out.println("nhap ten tai khoan :");
        tk.setTenTk(sc.nextLine());
        // cho tien mac dinh trong tk la 50
        tk.setSoTK(50);
    };
    public static void main(String[] args) {
        account a[]= null;
        int luachon=0;
        int n=0;
        long s,d;
        do {
            System.out.println("--------------MENU-----------");
            System.out.println("1.Nhap thong tin cua khach hang ");
            System.out.println("2.Xuat danh sach thong tin cua khach hang");
            System.out.println("3.Nap tien vao tai khoan");
            System.out.println("4.Rut tien trong tai khoang");;
            System.out.println("5.Dao han");
            System.out.println("6.Chuyen tien");
            System.out.println("7.Nhap so khac de thoat");
            System.out.println("nhap lua chon:");
            luachon=sc.nextInt();
            sc.nextLine();
            if(luachon==1){
                System.out.println("Nhap so luong khach hang:");
                n=sc.nextInt();
                a= new account[n];
                for(int i=0;i<n;i++){
                    System.out.println("Nhap khach hang thu "+(i+1));
                    a[i]= new account();
                    nhapTK(a[i]);
                }
            }
            else if(luachon==2){
                System.out.printf("%-10d %-20s %-20s","soTK","tenTK","str1");
                for(int i=0;i<n;i++){
                    a[i]= new account();
                    a[i].inTK();
                }
            }
            else if(luachon==3){
                System.out.println("Nhap so tai khoan ban muon nap tien:");
                s=sc.nextLong();
                for(int i=0;i<n;i++){
                    d=a[i].getSoTK();
                    if(s == d){
                        System.out.println("Tai khoan ban chon la:"+ d);
                        a[i].napTien();
                    }
                    else{
                        System.out.println("khong ton tai !");
                    }
                }
            }
            else if(luachon==4){
                System.out.println("Nhập số tài khoản khách hàng cần đáo hạn: ");
                    s = sc.nextLong();
                    for (int i = 0; i < n; i++) {
                        d = a[i].getSoTK();
                        if (s == d) {
                            System.out.println("Bạn chọn tài khoản: " + d);
                            a[i].rutTien();
                        } else {
                            System.out.println("");
                        }
                    }
            }
            else if(luachon==5){
                System.out.println("Nhập số tài khoản khách hàng cần đáo hạn: ");
                s = sc.nextLong();
                for (int i = 0; i < n; i++) {
                    d = a[i].getSoTK();
                    if (s == d) {
                        System.out.println("Bạn chọn tài khoản: " + d);
                        a[i].daoHan();
                    } else {
                        System.out.println("");
                    }
                }
            }
        
        } while(luachon!=0);
    }
}
