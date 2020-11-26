import java.util.Scanner;

public class TongCacSoTuNhien {

	public static void main(String[] args) {
		System.out.println("Nhập vào số tự nhiên muốn tính tổng các chữ số: ");
		Scanner scan = new Scanner(System.in);
		int naturalNum = Integer.parseInt(scan.nextLine());
		int[] degitNum = new int[100]; 
		int index = 0;
		while (naturalNum > 0) {
			degitNum[index++] = naturalNum % 10;
			naturalNum /= 10;
		}
		int tong = 0;
		for(int i = index - 1; i >= 0; i-- ) {
			tong += degitNum[i];
			
		}
		System.out.println("Tổng các chữ số của số tự nhiên trên là: "+tong);
		scan.close();
	}

}
