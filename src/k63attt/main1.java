package k63attt;

import java.util.Scanner;

public class main1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("nhap vao tu so A");
		int tusoA = sc.nextInt();
		System.out.println("nhap vao mau so A");
		int mausoA = sc.nextInt();
		System.out.println("nhap vao tu so B");
		int tusoB = sc.nextInt();
		System.out.println("nhap vao mau so B");
		int mausoB = sc.nextInt();
		sc.close();
		phanso phanSoA = new phanso(tusoA , mausoA );
		phanso phanSoB = new phanso(tusoB , mausoB);
		

		phanSoA.getPrint();
		phanSoA.toigian();
		phanSoA.getPrint();
		
//		System.out.println(phanSoA.UCLN(tusoA, mausoA));

	}
	
	
}
