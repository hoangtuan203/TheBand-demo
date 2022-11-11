// package OOP.Chuong_2;
// import java.util.Scanner;
// public class main {
// 	public static void main() {
// 		Scanner sc = new Scanner(System.in);
// 		DanhSachSinhVien dssv = new DanhSachSinhVien();
// 		int luaChon = 0;
// 		do {
// 			System.out.println("MENU ---------- ");
// 			System.out.println("Vui lòng chọn chức năng: ");
// 			System.out.println(
// 			  "1.	Them sinh vien vao danh sach.\n"
// 			+ "2.	In danh sach sinh vien ra man hinh.\n"
// 			+ "3.	Lay so luong sinh vien trong danh sach.\n"
//             + "4.   Kiem tra sinh vien co ton tai trong danh sach khong\n:"
// 			+ "5.	Xoa mot sinh vien trong danh sach dua vao ma sinh vien\n"
// 			+ "6.	Tim kiem sinh vien dua tren ten.\n"
// 			+ "0.   Thoát khỏi chương trình");
// 			luaChon = sc.nextInt();
// 			sc.nextLine();
			
// 			if(luaChon==1) {
// //				1.	Thêm sinh viên vào danh sách.
// 				System.out.println("Nhập mã sinh viên: "); String maSinhVien = sc.nextLine();
// 				System.out.println("Nhập họ và tên: "); String hoVaTen = sc.nextLine();
// 				System.out.println("Nhập năm sinh: "); int namSinh = sc.nextInt();
// 				System.out.println("Nhập điểm trung bình: "); float diemTrungBinh = sc.nextFloat();
// 				SinhVien sv = new SinhVien(maSinhVien, hoVaTen, namSinh, diemTrungBinh);
// 				dssv.themSinhVien(sv);
				
// 			}else if(luaChon==2) {
// //				2.	In danh sách sinh viên ra màn hình.
// 				dssv.inDanhSachSinhVien();
// 			}
// 			else if(luaChon==3) {
// 				System.out.println("Số lượng hiện tại: "+ dssv.laySoLuongSinhVien());
// 			}else if(luaChon==4) {
// //				4.	Kiểm tra sinh viên có tồn tại trong danh sách hay không, dựa trên mã sinh viên.
// 				System.out.println("Nhập mã sinh viên: "); String maSinhVien = sc.nextLine();
// 				SinhVien sv = new SinhVien(maSinhVien);
// 				System.out.println("Kiếm tra sinh viên có trong danh sách: "+dssv.kiemTraTonTai(sv));
// 			}else if(luaChon==5) {
// //				5.	Xóa một sinh viên ra khỏi danh sách dựa trên mã sinh viên.
// 				System.out.println("Nhập mã sinh viên: "); String maSinhVien = sc.nextLine();
// 				SinhVien sv = new SinhVien(maSinhVien);
// 				System.out.println("Xóa sinh viên trong danh sách: "+dssv.xoaSinhVien(sv));
// 			}else if(luaChon==6) {
// 				System.out.println("Nhập họ và tên: "); String hoVaTen = sc.nextLine();
// 				System.out.println("Kết quả tìm kiếm: ");
// 				dssv.timSinhVien(hoVaTen);
				
// 			}
// 		}while(luaChon!=0);
// 	}
// }

