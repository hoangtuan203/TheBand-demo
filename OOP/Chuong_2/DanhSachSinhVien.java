// /*
//  * To change this license header, choose License Headers in Project Properties.
//  * To change this template file, choose Tools | Templates
//  * and open the template in the editor.
//  */
// package OOP.Chuong_2;

// import java.io.FileInputStream;
// import java.io.FileNotFoundException;
// import java.io.FileOutputStream;
// import java.io.IOException;
// import java.io.ObjectInputStream;
// import java.io.ObjectOutputStream;
// import java.util.Arrays;
// import java.util.Scanner;
// import java.util.logging.Level;
// import java.util.logging.Logger;

// public class DanhSachSinhVien{
//     //public static final long serialVersionUID = 1L;
//     private int n;
//     private  SinhVien[] arrsv;
//     //String s[]={"A", "B", "C"};
//     Scanner sc=new Scanner(System.in);
//     public DanhSachSinhVien()
//     {
//         arrsv=null;
//         n=0;
//     }
//     public void nhapdssinhvien() 
//     {
        
//         System.out.println("Nhap vao so luong sinh vien:");
//         n=Integer.parseInt(sc.nextLine());
//         arrsv=new SinhVien[n];
//         for(int i=0;i<n;i++)
//         {
//             System.out.println("Nhap vao sinh vien thu:" +(i+1));
//             // Sử dụng cach 1
//             SinhVien a=new SinhVien();
//             a.nhapsinhvien();
//             arrsv[i]=a;
//             //-----------su dung cach 2---------
//             //arrsv[i]=new Sinhvien();
//             //arrsv[i].nhapsinhvien();
 
//         }
//     }
//     public void thaydoinoihoc(String noihoc)
//     {
//         System.out.println("Nhap vào nơi học mới:");
//         noihoc=sc.nextLine();
//         Sinhvien.setNoihoc(noihoc);
//     }
//     public void xuatmangsinhvien()
//     {
//         System.out.println("Danh sach sinh vien vua nhap)");
//         System.out.printf("%-12s%-12s%s\n","Column 1","Column 2","Column3");
//         System.out.printf("%-12d%-12d%07d\n", 15, 12, 5);
//         System.out.println("+-----------------------------------------------------------------------------------------------+");
//     	//System.out.println("| Ma sv |          Ho va ten           | Ngay sinh  |   Dia chi      |      Dien Thoai   |");
//     	System.out.printf("%-12s%-20s%-12s%-25s%-12s%-12s\n","MaSV","Ho va Ten","Ngay sinh","Dia Chi", "Dien Thoai","Noi hoc");
//         //System.out.println("+--------------------------------%-12s%-20s%-12s%-25s%-12s%-12s\\n\",-------------------------+");
//         //for(int i=0; i<arrsv.length; i++)
//         for(Sinhvien objsv: arrsv)
//         {    
//             //arrsv[i].xuatsinhvien(); 
//             objsv.xuatsinhvien();
//         }
//     }
//     public void timkiemsinhvien()
//     {
//         System.out.println("Nhap vào mã sinh viên cần tim:");
//         String masv=sc.nextLine();
//         for(int i=0; i<arrsv.length; i++)
//             if(arrsv[i].getMasv().equalsIgnoreCase(masv))
//                 arrsv[i].xuatsinhvien();
//     }
//     public Sinhvien timkiemsinhvien1()
//     {
//         Sinhvien sv=null;
//         System.out.println("Nhap vào mã sinh viên cần tim:");
//         String masv=sc.nextLine();
//         for(int i=0; i<arrsv.length; i++)
//             if(arrsv[i].getMasv().equalsIgnoreCase(masv))
//             {    
//                 sv=arrsv[i];
//                 break;
//             }
//         return sv;
//     }
//     public Sinhvien [] timkiemsinhvien2()
//     {
//         int j=0;
//         Sinhvien [] arrtimkiem=new Sinhvien[n];
//         System.out.println("Nhap vào tên sinh viên cần tim:");
//         String tensv=sc.nextLine();
//         for(int i=0; i<arrsv.length; i++)
//             if(arrsv[i].getHoten().equalsIgnoreCase(tensv))
//             {    
//                 arrtimkiem[j]=arrsv[i];
//                 j++;
//             }
//         return arrtimkiem;
//     }
//     public void themsinhvien()
//     {
//         System.out.println("Nhap thong tin sinh vien can them:");
//         Sinhvien sv=new Sinhvien();
//         sv.nhapsinhvien();
//         arrsv = Arrays.copyOf(arrsv, arrsv.length +1); 
//         arrsv[n]=sv;
//         n++;        
//     }
    
//     public void docfile_object() 
//     {
//         //-------------------B1. Tao di tuong luong va lien ket luong-----------
//         FileInputStream fis = null;
//         try {
//             fis = new FileInputStream("D:\\abc.txt");
//         } catch (FileNotFoundException ex) {
//             Logger.getLogger(DanhSachSinhVien.class.getName()).log(Level.SEVERE, null, ex);
//         }
//         ObjectInputStream ois = null;
//         try {
//             ois = new ObjectInputStream(fis);
//         } catch (IOException ex) {
//             System.out.println(ex.toString());
//         }
//         //-------------------B2.Doc du lieu-------------------------------------
    
//         try {
//             arrsv=(Sinhvien[])ois.readObject();
//         } catch (IOException ex) {
//             System.out.println(ex.toString());
//         } catch (ClassNotFoundException ex) {
//             System.out.println(ex.toString());
//         }
//        // int tam=sv.length;
//         //System.out.println("Tam="+tam);
        
//         for(int i=0; i<arrsv.length;i++)
//         {
//             System.out.println(arrsv[i].getHoten());
//         }
        
//     }
    
//     public void ghifile_object() 
//     {
//         //----------------tao doi tuong luong va lien ket luong du lieu-------
//         Sinhvien A=new Sinhvien("001", "Nguyen van a","1985", "Bentre", "0909626954");
//         FileOutputStream fos=null;
//         try {
//             fos = new FileOutputStream("D:\\abc.txt");
//         } catch (FileNotFoundException ex) {
//             System.out.println(ex.toString());
//         }
//         ObjectOutputStream oos=null;
//         try {
//             oos = new ObjectOutputStream(fos);
//         } catch (IOException ex) {
//             System.out.println(ex.toString());
//         }
//        //
//         System.out.println("Mang sau khi nhap sang:");
       
      
//         try {
//             oos.writeObject(A);
//         } catch (IOException ex) {
//             System.out.println(ex.toString());
//             //System.out.println("LOi");
//         }
//         try {
//             // -----------------------------dong luong---------------------------
//             fos.close();
//         } catch (IOException ex) {
//             Logger.getLogger(DanhSachSinhVien.class.getName()).log(Level.SEVERE, null, ex);
//         }
//         try {
//             oos.close();
//         } catch (IOException ex) {
//             Logger.getLogger(DanhSachSinhVien.class.getName()).log(Level.SEVERE, null, ex);
//         }
         
//     }
//     public static void main(String[] args) {
//         DanhSachSinhVien mangsv=new DanhSachSinhVien();
//         mangsv.nhapdssinhvien();
//         mangsv.xuatmangsinhvien();
//         //mangsv.timkiemsinhvien();
//         Sinhvien sv1=null;
//         sv1=mangsv.timkiemsinhvien1();
//         sv1.xuatsinhvien();
//         Sinhvien arr[]=null;
//         arr=mangsv.timkiemsinhvien2();
//         System.out.println("Phan tu cua mang:"+arr.length);
//         for(int i=0;i<arr.length-1;i++)
//             arr[i].xuatsinhvien();
        
//         mangsv.themsinhvien();
//         mangsv.xuatmangsinhvien();
//         //mangsv.docfile_object();
//        //Sinhvien[] sv=null; 
//        //sv=mangsv.nhapmangsinhvien();
//        //for(int i=0;i<sv.length;i++)
//         //mangsv.ghifile_object();
//     }
// }
