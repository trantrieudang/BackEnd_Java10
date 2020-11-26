import java.util.Scanner;

public class InChuoiNguocLai {

	public static void main(String[] args) {
		String original, reverse = "";
	    Scanner scan = new Scanner(System.in);

	    System.out.println("Nhập vào chuỗi cần đảo ngược thứ tự: ");
	    original = scan.nextLine();

	    int length = original.length();

	    for (int i = length - 1 ; i >= 0 ; i--)
	      reverse = reverse + original.charAt(i);

	    System.out.println("Chuỗi đã được đảo ngược là: " + reverse);
	    scan.close();
	}

}
