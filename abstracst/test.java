package abstracst;

public class test {
    public static void main(String[] args) {
        HangSanXuat h1 = new HangSanXuat("Hãng 1 ", "Việt Nam");
        HangSanXuat h2 = new HangSanXuat("Hãng 2 ", "Japan");
        HangSanXuat h3 = new HangSanXuat("Hãng 3 ", "USA");
        
        PhuongTienDiChuyen p1= new xeOto(h1, "Trường Hải");
        PhuongTienDiChuyen p2=  new mayBay(h2, "Xăng");
        PhuongTienDiChuyen p3 = new xeDap(h3);
        
    }
}
