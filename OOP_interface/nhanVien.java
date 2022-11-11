package OOP_interface;

import java.time.LocalDate;

public class nhanVien implements interface_A,interface_B {
    public void tinhTuoi()
    {
        LocalDate localDate = LocalDate.now();
        int year = localDate.getYear();
        System.out.println(year);
        System.out.println("nam hien tai:"+year);
        int tuoiHienTai = year - age;
        System.out.println("tuoi cua toi:"+tuoiHienTai);
    }
    public static void main(String[] args) {
        nhanVien nv = new nhanVien();
        nv.tinhTuoi();
        // nv.phuongThucInterface_B();
    }
    @Override
    public void them(){
        throw new UnsupportedOperationException("Not support yet.");
    }
    @Override
    public void timKiem(){
        throw new UnsupportedOperationException("Not support yet.");
    }
    @Override
    public void sua(){
        throw new UnsupportedOperationException("Not support yet.");
    }
    @Override
    public void xoa(){
        throw new UnsupportedOperationException("Not support yet.");
    }
    public  void phuongThucInterface_B(){
        System.out.println("phuong thuc interface B!");
    }
}
