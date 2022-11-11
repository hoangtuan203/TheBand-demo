
import java.util.Scanner;

public class giaSuc {
    private String ten;
    private static int ma=0;
    private int soLitSua;
    public String ten(){
        return ten;
    }
    public int ma(){
        return ma;
    }
    public int soLitSua()
    {
        return soLitSua;
    }
    Scanner sc = new Scanner(System.in);
    public giaSuc(){
        ma++;
        ten="";
        soLitSua=0;
    }
    public giaSuc(String ten,int ma,int soLitSua){
        this.ten=ten;
        this.ma=ma;
        this.soLitSua=soLitSua;
    }
 }