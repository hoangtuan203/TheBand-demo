package OOP.Chuong_2;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class bai8 {
    Scanner sc=  new Scanner(System.in);
    private String s;
    public bai8(){
        this.s="";
    }
    public bai8(String s){
        this.s=s;
    }
    public String getChuoi(){
        return s;
    }
    public void setChuoi(String s){
        this.s=s;
    }
    public void nhapChuoi(){
        System.out.println("nhap vao chuoi:");
        s=sc.nextLine();
    }
    public void xuatChuoi(){
        System.out.println("chuoi vua nhap la:"+s);
    }
    public void length(){
        System.out.println("do dai chuoi s:"+s.length());
    }
    public void xoaKhoangTrang(){
        System.out.println("chuoi ban dau:"+s);
        s=s.replaceAll(" ", "");// thay the khoang trang thanh ki tu rong
        System.out.println("chuoi sau khi xoa khoang trang :"+s);
    }
    public void chuyenChuHoaSangThuong(){
        String s1=s.toUpperCase();
        System.out.println("chuyen hoa sang thuong:"+s1);
    }
    public void chuyenChuThuongSangHoa(){
        String s1=s.toLowerCase();
        System.out.println("chuyen thuong sang hoa:"+s1);
    }
    public void demNA_PA(){
        int vcount=0,ccount=0;
        s=s.toLowerCase();
        for(int i = 0; i < s.length(); i++) { 
            char ch = s.charAt(i); 
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') { 
                vcount++;
             }
            else if((ch >= 'a'&& ch <= 'z')) {
                ccount++;
            }
        }
        System.out.println("nguyen am la:"+vcount);
        System.out.println("phu am la:"+ccount);
    }
    public void timKiem() {
        Map<Character, Integer> map = new HashMap<Character, Integer>();
        char[] chars = s.toCharArray();
      
        for (Character ch : chars) {
            if (map.containsKey(ch)) {
                map.put(ch, map.get(ch) + 1);
            } else {
                map.put(ch, 1);
            }
        }
        Set<Character> keys = map.keySet();
        for (Character ch : keys) {
            if (map.get(ch) > 1) {
                System.out.println("Char " + ch + " " + map.get(ch));
            }
        }
}
}
