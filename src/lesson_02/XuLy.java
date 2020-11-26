import java.util.ArrayList;
import java.util.Scanner;

public class XuLy {

	public static void main(String[] args) {

		Truong_Hoc truong = new Truong_Hoc();
		truong.dummyData();
		truong.tinhDTB();
		truong.xepLoai();
		truong.xuat();
		System.out.println("Danh sách sinh viên có ĐTB cao nhất");
		ArrayList<Quan_Ly_Sinh_Vien> list = truong.timDSSVDTBMax();

		truong.xuatDanhSach(list);
		System.out.println("Danh sách sinh viên có xếp loại Yếu");
		ArrayList<Quan_Ly_Sinh_Vien> listYeu = truong.timDSSVYeu();

		truong.xuatDanhSach(listYeu);



		System.out.println("Tìm danh sách sinh viên theo mã");
		System.out.println("Mời nhập mã sinh viên cần tìm");
		Scanner scan = new Scanner(System.in);
		int ma = Integer.parseInt(scan.nextLine());
		Quan_Ly_Sinh_Vien sv = truong.timSVTheoMa(ma);
		if (sv != null) {
			sv.xuat();
		} else {
			System.out.println("Không có sinh viên mã: " + ma + " trong danh sách");
		}
		

		System.out.println("Mời nhập mã sinh viên cần xóa");
		ma = Integer.parseInt(scan.nextLine());
		boolean xoa = truong.xoaSVTheoMa(ma);
		if (xoa) {
			System.out.println("Xóa thành công");
		} else {
			System.out.println("Không tìm thấy hoặc xóa không thành công");
		}
		scan.close();
	}



}
