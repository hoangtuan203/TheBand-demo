package abstracst;

public class xeDap extends PhuongTienDiChuyen{
    public xeDap(HangSanXuat hangSanXuat){
        super("Xe đạp", hangSanXuat); 
    }
    @Override
    public double layVanToc(){
        return 20;
    }
}
