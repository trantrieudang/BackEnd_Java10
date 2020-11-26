import java.util.ArrayList;

public class Truong_Hoc {
	// 1. Thuộc tính/Data members/Attributes/Fields
	private Danh_sach_sinh_vien objDSSV;

	// 2. Get, set method
	public Danh_sach_sinh_vien getObjDSSV() {
		return objDSSV;
	}

	public void setObjDSSV(Danh_sach_sinh_vien objDSSV) {
		this.objDSSV = objDSSV;
	}

	// 3. Constructors (Các phương thức khởi tạo)
	public Truong_Hoc() {
		objDSSV = new Danh_sach_sinh_vien();
	}

	// 4. Nhập xuất (input, output)
	public void dummyData() {
		Quan_Ly_Sinh_Vien sv = new Quan_Ly_Sinh_Vien("Dang", 1, 9.4f, 4.2f, 9);
		this.objDSSV.themSinhVien(sv);
		sv = new Quan_Ly_Sinh_Vien("Hung", 2, 5.3f, 4.2f, 8);
		this.objDSSV.themSinhVien(sv);
		sv = new Quan_Ly_Sinh_Vien("Lan", 3, 9.1f, 8.2f, 7.2f);
		this.objDSSV.themSinhVien(sv);
		sv = new Quan_Ly_Sinh_Vien("lan", 4, 9.2f, 5.7f, 8.5f);
		this.objDSSV.themSinhVien(sv);
		sv = new Quan_Ly_Sinh_Vien("Tung", 5, 9.6f, 6.2f, 5.9f);
		this.objDSSV.themSinhVien(sv);
		sv = new Quan_Ly_Sinh_Vien("Thanh", 6, 9, 10, 10);
		this.objDSSV.themSinhVien(sv);
		sv = new Quan_Ly_Sinh_Vien("Viet", 7, 9, 10, 10);
		this.objDSSV.themSinhVien(sv);
		sv = new Quan_Ly_Sinh_Vien("Thoa", 8, 2, 3, 1);
		this.objDSSV.themSinhVien(sv);
		sv = new Quan_Ly_Sinh_Vien("Thuy", 9, 2, 3, 1);
		this.objDSSV.themSinhVien(sv);
		sv = new Quan_Ly_Sinh_Vien("Thuong", 10, 2, 3, 1);
		this.objDSSV.themSinhVien(sv);
		sv = new Quan_Ly_Sinh_Vien("Thach", 11, 2, 3, 5);
		this.objDSSV.themSinhVien(sv);
	}
	
	public void xuat() {
		this.objDSSV.xuat();
	}
	// 5. Business methods
	public void tinhDTB() {
		this.objDSSV.tinhDTB();
	}
	public void xepLoai() {
		this.objDSSV.xepLoai();
	}
	public ArrayList<Quan_Ly_Sinh_Vien> timDSSVDTBMax() {
		return this.objDSSV.timDSSVDTBCaoNhat();
	}
	public ArrayList<Quan_Ly_Sinh_Vien> timDSSVDTBMin() {
		return this.objDSSV.timDSSVDTBThapNhat();
	}
	public ArrayList<Quan_Ly_Sinh_Vien> timDSSVYeu() {
		return this.objDSSV.timDSSVYeu();
	}
	public void xuatDanhSach(ArrayList<Quan_Ly_Sinh_Vien> list) {
		for(Quan_Ly_Sinh_Vien sv: list) {
			sv.xuat();
		}
	}
	public ArrayList<Quan_Ly_Sinh_Vien> timDSSVTheoTen(String tenMuonTim){
		return this.objDSSV.timSVTheoTen(tenMuonTim);
	}
//	public ArrayList<Quan_Ly_Sinh_Vien> timDSSVTheoMa(int maMuonTim){
//		return this.objDSSV.timSVTheoMa(maMuonTim);
//	}
	
	public Quan_Ly_Sinh_Vien timSVTheoMa(int ma){
		return this.objDSSV.timSVTheoMa(ma);
	}
	
	
	public boolean xoaSVTheoMa(int ma) {
		return this.objDSSV.xoaSVTheoMa(ma);
	}
	
	
}


