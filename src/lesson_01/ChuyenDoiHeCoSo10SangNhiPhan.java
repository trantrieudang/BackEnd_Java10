import java.util.Scanner;

public class ChuyenDoiHeCoSo10SangNhiPhan {

	public static void main(String[] args) {
		System.out.println("Nhập vào hệ cơ số 10");
		Scanner scan = new Scanner(System.in);
		int decimalNum = Integer.parseInt(scan.nextLine());
		int[] binaryNum = new int[100];
		int index = 0;
		while(decimalNum > 0) {
			binaryNum[index++] = decimalNum % 2;
			decimalNum /= 2;
		}
		System.out.println("Hệ cơ số nhị phân của số trên là: ");
		for(int i = index-1; i>=0; i--) {
			
			System.out.print(binaryNum[i]);
		}
		
		scan.close();
	}

}
