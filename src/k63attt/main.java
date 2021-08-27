package k63attt;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Scanner;

public class main {
	public static void main(String[] args) throws FileNotFoundException {
//		baitap math = new baitap();
////		System.out.println(math.sum(3, 2));
//		System.out.println("********************* book manager *************");
////		Scanner sc = new Scanner(System.in);
////		boolean flag = true;
////		float a = 1.23423f;
////		do {
////			System.out.println("1. create book");
////			System.out.println("2. edit book");
////			System.out.println("3. info book");
////			System.out.println("4. exit program");
////			int choose = sc.nextInt();
////			
////			if(choose == 4) {
////				flag = false;
////			}
//////			sc.nextLine();
////			System.out.println(choose);
////		}
////		while (flag == true);
////		sc.close();
////		// print 
//////		int a = 101;
//////		String str1 = "a la so chan";
//////		String str2 = "a la so le";
//////		String str;
//////		
//////		
//////		str = (a % 2 == 0) ? str1 : str2;
//////		System.out.println(str);
//		File file = new File("show.txt");
//		Scanner scanner = new Scanner(file);
//		while(scanner.hasNextLine()) {
//			String line = scanner.nextLine();
//			System.out.println(line);
//		}
//		scanner.close();
//////		String str = "enough";
//////		String str1 = "length not enough";
//////		String str2= "fail";
//////		str = (str.length() <12) ? str1: str2;
//////		System.out.println(str.indexOf("b"));
//		
		int m =5;
		int n =5;
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				if((i == 0 || i == 3) && (j == 1 || j == 3)) {
					System.out.print(" **");
				}
				if(i == 1 &&(j == 0 )) {
					System.out.print("**");
				}
				if(i == 1 &&(j==4 )) {
					System.out.print("**");
				}
				if(i == 1 &&(j==2 )) {
					System.out.print(" ** ");
				}
				if(i == 4 &&(j==2 )) {
					System.out.print("   ** ");
				}
				if(i == 2 && j == 0) {
					System.out.print(" lE THI THU HA");
				}
				else {
					System.out.print("  ");}
			}
			System.out.println("");
			
		}
//		
//		int a = 50;
//		for(int i = 0; i < a + 1; i++) {
//			if(i % 2 != 0) {
//				continue;
//			}
//			System.out.println(i);
//		}
		
//		
		HashMap<String, Integer> obj = new HashMap<String, Integer>();
		obj.put("halo you", 5);
		obj.put("name", 7);
		System.out.println(obj.get("name"));
		
	}
}
