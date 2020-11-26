import java.util.Scanner;

public class TimUocSoCuaSoTuNhien {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập vào số tự nhiên cần tìm ước số chung: ");
		int naturalNum = Integer.parseInt(sc.nextLine());
		int[] a = new int[100];
		int index=0;
		System.out.println("Các ước số chung của số trên: ");
		for(int i = 1; i <= naturalNum; i++) {
			if(naturalNum % i == 0) {
				a[index] = i;
				System.out.print(a[index] + "\t");
			}
			
		}
		
		sc.close();
	}

}
