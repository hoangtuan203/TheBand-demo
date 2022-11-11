package abstracst;

public class xeOto extends PhuongTienDiChuyen {
    private String loaiNhienLieu;
    public xeOto(HangSanXuat hangSanXuat,String loaiNhienLieu){
        super("Xe oto",hangSanXuat);
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
        return 60;
    }
}
