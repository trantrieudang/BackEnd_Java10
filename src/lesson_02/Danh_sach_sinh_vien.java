import java.util.ArrayList;
import java.util.Scanner;


public class Danh_sach_sinh_vien {
	// 1. Thuộc tính/Data members/Attributes/Fields
	private ArrayList<Quan_Ly_Sinh_Vien> listSV;

	// 2. Get, set method

	public ArrayList<Quan_Ly_Sinh_Vien> getListSV() {
		return listSV;
	}

	public void setListSV(ArrayList<Quan_Ly_Sinh_Vien> listSV) {
		this.listSV = listSV;
	}

	// 3. Constructors (Các phương thức khởi tạo)
	public Danh_sach_sinh_vien() {
		this.listSV = new ArrayList<Quan_Ly_Sinh_Vien>();
	}

	// 4. Nhập xuất (input, output)
	public void themSinhVien(Quan_Ly_Sinh_Vien sv) {
		this.listSV.add(sv);
	}

	// Xuất toàn bộ sinh viên
	public void xuat() {
		for (Quan_Ly_Sinh_Vien sv : this.listSV) {
			sv.xuat();
		}
	}

	public void nhap(Scanner scan) {
		for (Quan_Ly_Sinh_Vien sv : this.listSV) {
			sv.nhap(scan);

		}
	}

	// 5. Business methods
	public void tinhDTB() {
		for (Quan_Ly_Sinh_Vien sv : this.listSV) {
			sv.tinhDTB();
		}
	}

	public void xepLoai() {
		for (Quan_Ly_Sinh_Vien sv : this.listSV) {
			sv.xepLoai();
		}
	}

	public ArrayList<Quan_Ly_Sinh_Vien> timDSSVDTBCaoNhat() {
		ArrayList<Quan_Ly_Sinh_Vien> list = new ArrayList<Quan_Ly_Sinh_Vien>();
		if (this.listSV.size() > 0) { // Phải có ít nhất 1 sv
			Quan_Ly_Sinh_Vien svMax = this.listSV.get(0);
			int index = 0;
			for (int i = index; i < this.listSV.size(); i++) {
				Quan_Ly_Sinh_Vien svCurrent = this.listSV.get(i);
				if (svCurrent.getDiemTB() > svMax.getDiemTB()) {
					svMax = svCurrent;
					index = i;
				}

			}

			for (int i = index; i < this.listSV.size(); i++) {
				Quan_Ly_Sinh_Vien current = this.listSV.get(i);
				if (current.getDiemTB() == svMax.getDiemTB()) {
					list.add(current);
				}
			}

		}
		return list;
	}

	public ArrayList<Quan_Ly_Sinh_Vien> timDSSVDTBThapNhat() {
		ArrayList<Quan_Ly_Sinh_Vien> list = new ArrayList<Quan_Ly_Sinh_Vien>();
		if (this.listSV.size() > 0) { // Phải có ít nhất 1 sv
			Quan_Ly_Sinh_Vien svMin = this.listSV.get(0);
			int index = 0;
			for (int i = index; i < this.listSV.size(); i++) {
				Quan_Ly_Sinh_Vien svCurrent = this.listSV.get(i);
				if (svCurrent.getDiemTB() < svMin.getDiemTB()) {
					svMin = svCurrent;
					index = i;
				}

			}

			for (int i = index; i < this.listSV.size(); i++) {
				Quan_Ly_Sinh_Vien current = this.listSV.get(i);
				if (current.getDiemTB() == svMin.getDiemTB()) {
					list.add(current);
				}
			}

		}
		return list;
	}

	public ArrayList<Quan_Ly_Sinh_Vien> timDSSVYeu() {
		ArrayList<Quan_Ly_Sinh_Vien> list = new ArrayList<Quan_Ly_Sinh_Vien>();
		for (int i = 0; i < this.listSV.size(); i++) {
			if (this.listSV.get(i).getDiemTB() < 5) {
				list.add(this.listSV.get(i));
			}
		}
		return list;
	}

	public ArrayList<Quan_Ly_Sinh_Vien> timSVTheoTen(String tenMuonTim) {
		ArrayList<Quan_Ly_Sinh_Vien> list = new ArrayList<Quan_Ly_Sinh_Vien>();
		for (Quan_Ly_Sinh_Vien sv : this.listSV) {
			if (tenMuonTim.equalsIgnoreCase(sv.getTenSV())) {
				list.add(sv);
			}
		}
		return list;
	}

//	public ArrayList<Quan_Ly_Sinh_Vien> timSVTheoMa(int maMuonTim){
//		ArrayList<Quan_Ly_Sinh_Vien> list = new ArrayList<Quan_Ly_Sinh_Vien>();
//		for(int i = 0; i < this.listSV.size();i++) {
//			if(maMuonTim == this.listSV.get(i).getMaSV()) {
//				list.add(this.listSV.get(i));
//			}
//		}
//		return list;
//	}

	public Quan_Ly_Sinh_Vien timSVTheoMa(int ma) {
		Quan_Ly_Sinh_Vien sv = null; // Chưa tìm thấy sinh viên
		for (Quan_Ly_Sinh_Vien current : this.listSV) {
			if (current.getMaSV() == ma) {
				sv = current;
				break;
			}

		}
		return sv;
	}

	public boolean xoaSVTheoMa(int ma) {
		boolean flag = false; // Chưa xóa thành công
		Quan_Ly_Sinh_Vien sv = timSVTheoMa(ma);
		if (sv != null) {// Nếu có sinh viên có mã cần tìm
			this.listSV.remove(sv);
			flag = true; //Xóa thành công

		}

		return flag;
	}

}
