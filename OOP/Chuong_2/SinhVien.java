package OOP.Chuong_2;

import java.util.Objects;
import java.util.Scanner;
public class SinhVien implements Comparable<SinhVien>{
	Scanner sc= new Scanner(System.in);
	private String maSinhVien;
    private String hoVaTen;
	private int namSinh;
	private float diemTrungBinh;
	private int siSo;
	public SinhVien(String maSinhVien) {
		this.maSinhVien = maSinhVien;
	}
	public SinhVien(String maSinhVien, String hoVaTen, int namSinh, float diemTrungBinh) {
		this.maSinhVien = maSinhVien;
		this.hoVaTen = hoVaTen;
		this.namSinh = namSinh;
		this.diemTrungBinh = diemTrungBinh;
	}
	public String getMaSinhVien() {
		return maSinhVien;
	}

	public void setMaSinhVien(String maSinhVien) {
		this.maSinhVien = maSinhVien;
	}

	public String getHoVaTen() {
		return hoVaTen;
	}

	public void setHoVaTen(String hoVaTen) {
		this.hoVaTen = hoVaTen;
	}

	public int getNamSinh() {
		return namSinh;
	}

	public void setNamSinh(int namSinh) {
		this.namSinh = namSinh;
	}

	public float getDiemTrungBinh() {
		return diemTrungBinh;
	}

	public void setDiemTrungBinh(float diemTrungBinh) {
		this.diemTrungBinh = diemTrungBinh;
	}
	public void nhap(String maSinhVien, String hoVaTen, int namSinh, float diemTrungBinh){
		System.out.println("nhap ma sinh vien:");
		maSinhVien=sc.nextLine();
		sc.nextLine();
		System.out.println("nhap ho va ten:");
		hoVaTen=sc.nextLine();
		System.out.println("nhap nam sinh:");
		namSinh=sc.nextInt();
		System.out.println("nhap diem trung binh:");
		diemTrungBinh=sc.nextFloat();
	}
	@Override
	public String toString() {
		return "SinhVien [maSinhVien=" + maSinhVien + ", hoVaTen=" + hoVaTen + ", namSinh=" + namSinh
				+ ", diemTrungBinh=" + diemTrungBinh + "]";
	}

	@Override
	public int compareTo(SinhVien o) {
		return this.maSinhVien.compareTo(o.maSinhVien);
	}

	@Override
	public int hashCode() {
		return Objects.hash(diemTrungBinh, hoVaTen, maSinhVien, namSinh);
	}
}