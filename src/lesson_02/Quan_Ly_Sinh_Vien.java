import java.util.Scanner;


public class Quan_Ly_Sinh_Vien {
	// 1. Thuộc tính/Data members/Attributes/Fields
	private String tenSV;
	private int maSV;
	private float diemToan;
	private float diemLy;
	private float diemHoa;
	private float diemTB;
	private String xepLoai;

	// 2. Get, set method
	public float getDiemToan() {
		return diemToan;
	}

	public String getTenSV() {
		return tenSV;
	}

	public void setTenSV(String tenSV) {
		this.tenSV = tenSV;
	}

	public int getMaSV() {
		return maSV;
	}

	public void setMaSV(int maSV) {
		this.maSV = maSV;
	}

	public String getXepLoai() {
		return xepLoai;
	}

	public void setDiemToan(float diemToan) {
		this.diemToan = diemToan;
	}

	public float getDiemLy() {
		return diemLy;
	}

	public void setDiemLy(float diemLy) {
		this.diemLy = diemLy;
	}

	public float getDiemHoa() {
		return diemHoa;
	}

	public void setDiemHoa(float diemHoa) {
		this.diemHoa = diemHoa;
	}

	public float getDiemTB() {
		return diemTB;
	}

	// 3. Constructors (Các phương thức khởi tạo)/Cùng với tên lớp/ko có kiểu trả
	// về/khi tạo ra instance
	// Có 2 loại khởi tạo: Có tham số và không có tham số
	public Quan_Ly_Sinh_Vien() {

	}

	public Quan_Ly_Sinh_Vien(String tenSV, int maSV, float diemToan, float diemLy, float diemHoa) {

		this.tenSV = tenSV;
		this.maSV = maSV;
		this.diemToan = diemToan;
		this.diemLy = diemLy;
		this.diemHoa = diemHoa;
	}

	// 4. Nhập xuất (input, output)
	public void nhap(Scanner scan) {
		System.out.println("==== Nhập thông tin sinh viên ====");
		System.out.println("Nhập Tên: ");
		this.tenSV = scan.nextLine();
		System.out.println("Nhập Mã: ");
		this.maSV = Integer.parseInt(scan.nextLine());
		System.out.println("Mời nhập điểm Toán : ");
		this.diemToan = Float.parseFloat(scan.nextLine());
		System.out.println("Mời nhập điểm Lý: ");
		this.diemLy = Float.parseFloat(scan.nextLine());
		System.out.println("Mời nhập điểm Hóa: ");
		this.diemHoa = Float.parseFloat(scan.nextLine());
	}
	public void xuat() {
		System.out.println("Sinh viên => Tên: " + this.tenSV + " Mã: " + this.maSV + " Điểm Toán: " + this.diemToan + " Điểm Lý: " + this.diemLy + " Điểm Hóa: " + this.diemHoa + " Điểm TB: " + this.diemTB + " Xếp hạng: " + this.xepLoai);
	}
	// 5. Business methods
	public void tinhDTB() {
		this.diemTB = (this.diemToan + this.diemLy + this.diemHoa)/3;
	}
	public void xepLoai() {
		if(this.diemTB >=9) {
			this.xepLoai = "Xuất sắc";
		}
		else if(this.diemTB >=8) {
			this.xepLoai = "Giỏi";
		}
		else if(this.diemTB >=7) {
			this.xepLoai = "Khá";
		}
		else if(this.diemTB >=6) {
			this.xepLoai = "TB Khá";
		}
		else if(this.diemTB >=5) {
			this.xepLoai = "TB";
		}
		else {
			this.xepLoai = "Yếu";
		}
	}
}
