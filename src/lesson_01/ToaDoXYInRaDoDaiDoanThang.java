import java.util.Scanner;

public class ToaDoXYInRaDoDaiDoanThang {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Nhập tọa độ A: ");
		System.out.println("x1: ");
		double x1 = Double.parseDouble(scan.nextLine());
		System.out.println("y1: ");
		int y1 = Integer.parseInt(scan.nextLine());
		
		System.out.println("Nhập tọa độ B: ");
		System.out.println("x2: ");
		double x2 = Double.parseDouble(scan.nextLine());
		System.out.println("y2: ");
		int y2 = Integer.parseInt(scan.nextLine());
		
		//Tính khoảng cách giữa A và B:
		double khoangCach = Math.sqrt(Math.pow((x2-x1), 2) + Math.pow((y2-y1), 2));
		
		System.out.println("Khoảng cách giữa A và B là: " + khoangCach);
		
		
		
		scan.close();
	}

}
