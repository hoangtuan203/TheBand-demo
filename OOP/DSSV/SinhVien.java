package OOP.DSSV;

import java.util.Scanner;

public class SinhVien {
        private String masv;
        public String hoten;
        protected String ngaysinh;
        private String diachi;
        public static String dienthoai; 
        private static String noihoc;
        private static int dem=0;
        Scanner sc = new Scanner(System.in);
        public SinhVien()
        {
            this.masv=null;
            this.hoten=null;
            this.ngaysinh=null;
            this.diachi=null;
            this.dienthoai=null;
            dem++;
        }
    
        public SinhVien(String masv, String hoten, String ngaysinh, String diachi, String dienthoai) {
            this.masv = masv;
            this.hoten = hoten;
            this.ngaysinh = ngaysinh;
            this.diachi = diachi;
            this.dienthoai = dienthoai;
            dem++;
        }
        
        public void setMasv(String masv) {
            this.masv = masv;
        }
       
        public void setHoten(String hoten) {
            this.hoten = hoten;
        }
    
        public void setNgaysinh(String ngaysinh) {
            this.ngaysinh = ngaysinh;
        }
    
        public void setDiachi(String diachi) {
            this.diachi = diachi;
        }
    
        public static void setDienthoai(String dienthoai) {
            SinhVien.dienthoai = dienthoai;
        }
    
        public static void setNoihoc(String noihoc) {
            SinhVien.noihoc = noihoc;
        }
    
          public String getMasv() {
            return masv;
        }
    
        public String getHoten() {
            return hoten;
        }
    
        public String getNgaysinh() {
            return ngaysinh;
        }
    
        public String getDiachi() {
            return diachi;
        }
    
        public String getDienthoai() {
            return dienthoai;
        }
    
        public static String getNoihoc() {
            return noihoc;
        }
        
        public void nhapsinhvien()
        {
            System.out.println("Nhap ma sv:");
            masv=sc.nextLine();
            System.out.println("Nhap hoten:");
            hoten=sc.nextLine(); 
            System.out.println("Nhap ngay sinh:");
            ngaysinh=sc.nextLine();
            System.out.println("Nhap địa chỉ:");
            diachi=sc.nextLine();
            System.out.println("Nhap điện thoại:");
            dienthoai=sc.nextLine();
        }
       
        public void xuatsinhvien()
        {
            System.out.printf("%-12s%-20s%-12s%-25s%-12s%-12s\n",masv,hoten,ngaysinh, diachi, dienthoai,noihoc);
           //System.out.println(masv +"\t"+ hoten+"\t\t");
        }  
 }