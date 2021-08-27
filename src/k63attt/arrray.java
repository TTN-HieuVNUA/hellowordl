package k63attt;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class arrray {
	public static void main(String[] args) throws FileNotFoundException{
		/// tìm số lớn nhất và nhỏ nhất trong 1 mảng;
//	int number[] = new int[] {31,2,12,9,4,32,11,43};
//	
//	int largest = number[0];
//	int smallest = number[0];
//	
//	for(int i=0; i< number.length; i++) {
//		// largest
//		if(largest < number[i]) {
//			largest = number[i];
//		}
//		
//		// smallest
//		
//		if(smallest > number[i]) {
//			smallest = number[i];
//		}
//	}
//	System.out.println("so lon nhat la" + largest);
//	System.out.println("so nho nhat la" + smallest);
//	String car[] = new String[] {"BMW" , "Vovol"};
//	for(String i : car){
//		System.out.print(i + " ");
//	}
//		int matrix[][] = new int[][] {  { 1, 2, 3 }, 
//										{ 4, 5, 6, 7 },
//										{ 7, 8, 9 } };
//		for(int i=0; i < matrix.length; i++) {
//			for(int j =0; j< matrix[i].length ;j++) {
//				System.out.print(matrix[i][j]+ " ");
//			}
//			System.out.println("");
//		}
//		System.out.println("=========================");
//		
//		for(int[] matrixs : matrix ) {
//			for(int j : matrixs) {
//				System.out.print(j + " ");
//			}
//			System.out.println(" ");		
			
//		}
	String[] print = new String[100]; 
	File file = new File("show.txt");
	Scanner scanner = new Scanner(file);
	int i = 1;
	while(scanner.hasNext()) {
		print[i] = scanner.next();
		i++;
	}
	showinfo(print);
	}

	/// method 
	private static void showinfo(String[] show) {
		for(String read : show) {
			if(read == null) {
				continue;
			}
			System.out.println(read);
		}
	}
}
