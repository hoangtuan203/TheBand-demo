package abstracst;

public class mayBay extends PhuongTienDiChuyen {
    private String loaiNhienLieu;
    public mayBay(HangSanXuat hangSanXuat,String loaiNhienLieu){
        super("Máy bay",hangSanXuat);
        this.loaiNhienLieu=loaiNhienLieu;
    }
    public String getLoaiNhienLieu(){
        return loaiNhienLieu;
    }
    public void setLoaiNhienLieu(String loaiNhienLieu){
        this.loaiNhienLieu=loaiNhienLieu;
    }
    @Override
    public double layVanToc(){
        return 500;
    }
    public void catCanh(){
        System.out.println("Cat canh....");
    }
    public void haCanh(){
        System.out.println("Ha canh ....");
    }
}
