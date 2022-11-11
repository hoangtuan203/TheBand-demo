// package OOP.Chuong_2;

// import java.util.Scanner;

// import phieu_du_thuong.sinhVien;
// public class test2 {
//     static Scanner sc= new Scanner(System.in);
//     public void menu(){
//         System.out.println("===========MENU===========");
//         System.out.println("1.Thiet ke class DIEM");
//         System.out.println("2.Thiet ke class HINH CHU NHAT");
//         System.out.println("3.Thiet ke class HINH TRON");
//         System.out.println("4.Thiet ke class SINH VIEN");
//         System.out.println("5.Bo sung ham thiet lap vao cac lop tren");
//         System.out.println("6.Thiet ke class so nguyen");
//         System.out.println("7.Thiet ke class Mang");
//         System.out.println("8.Thiet ke class Chuoi");
//         System.out.println("9.Thiet ke class DANH SACH SINH VIEN");
//         System.out.println("==============================");
//     }
//     public static void main(String[] args) {
//         int luachon=0;
//         test2 t2= new test2();
//         t2.menu();
//         System.out.println("vui long nhap lua chon:");
//         luachon=sc.nextInt();
//         switch (luachon) {
//             case 1:
//                 DIEM diem=new DIEM();
//                 diem.nhap();
//                 diem.xuat();
//                 diem.move();
//                 System.out.println("diem sau khi di chuyen:");
//                 diem.xuat();
//                 break;
//             case 2:
//                 HCN hcn= new HCN();
//                 hcn.nhap();
//                 hcn.hienThi();
//                 hcn.chuVi();
//                 hcn.dienTich();
//             case 3:
//                 HT ht= new HT();
//                 ht.nhap();
//                 ht.xuat();
//                 ht.chuVi();
//                 ht.dienTich();
//             case 4:
//                 sinhVien sv= new sinhVien();
//                 sv.nhap();
//                 sv.xuat();
//                 System.out.println("dtb: "+sv.diemTrungBinh());
//                 //sv.xepLoaiHocLuc(diemTB);
//             case 6:
//                 bai6 b6 =  new bai6();
//                 b6.nhap();
//                 if(b6.isPrime()){
//                     System.out.println("la so nguyen to");
//                 }
//                 else{
//                     System.out.println("khong la so nguyen to");
//                 }
//                 //
//                 if(b6.find_square_number()==1){
//                     System.out.println("la so chinh phuong");
//                 }
//                 else {
//                     System.out.println("khong la so chinh phuong");
//                 }
//                 //
//                 if(b6.ktraSoHH()==true){
//                     System.out.println("la so hoan hao");
//                 }
//                 else{
//                     System.out.println("khong la so hoan hao");
//                 }
//                System.out.println("can bac hai:"+b6.squareRoot());
//                 b6.InNSNT();
//             case 8:
//                 bai8 b8= new bai8();
//                 b8.nhapChuoi();
//                 b8.xuatChuoi();
//                 b8.xoaKhoangTrang();
//                 b8.chuyenChuThuongSangHoa();
//                 b8.chuyenChuHoaSangThuong();
//                 b8.demNA_PA();
//                 b8.timKiem();
//             case 9:
//                 // main b9= new main();
//                 // b9.main();
//             default:
//                 break;
//         }
//     }
// }