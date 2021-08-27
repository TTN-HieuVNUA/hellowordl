package k63attt;

import java.util.Scanner;

public class baitap {
public static void main(String[] args) {
	/// bài 1
	
	int length = 5;
	int width = 4;
	for(int i =0; i < length; i++) {
		for(int j = 0; j< width; j++) {
			System.out.print("* ");
		}
		System.out.println("");
	}
	System.out.println("=====================");
	// bài 2
	int lengths = 4;
	int widths = 5;
	for(int i =0 ; i < lengths; i++) {
		for(int j = 0; j < widths; j++) {
			if(i ==0 || i ==3) {
				System.out.print("*");
			}
			if((i == 1 || i ==2) && (j == 0 || j == 4) ) {
				System.out.print("*");
			}
			if((i == 1 || i ==2) && (j == 1 || j == 2|| j==3) ) {
				System.out.print(" ");
			}
			
		}
		System.out.println(" ");
	}
	System.out.println("==========================");
	// Bài 3
//	System.out.println("nhập vào chiều cao tam giác:");
	Scanner sc = new Scanner(System.in);
//	int h = sc.nextInt();
//	    int x, output;
//	  
//	    for(int i = 1;i<= h; i++){
//	      for(int j = 0; j<= 2*h; j++){
//	        x = j-h;
//	        if(x < 0){
//	          x *= -1;
//	        }
//	        output = i - x;
//	        if(output > 0){
//	          System.out.printf("%3d", output);
//	        } 
//	        else{
//	          System.out.printf("   ");
//	        }
//	      }
//	      System.out.println();
//	    }
//	    System.out.println("---------------------------------");
//	    
	    //// bài 4
	    int a = sc.nextInt();
	    int sum = 0;
	    for(int i = 1; i< a + 1; i++) {
	    	if(a % 2 != 0) {
	    		sum += i;
		    	i++;
	    	}
	    	if(a % 2 == 0) {
	    		if(i == 1) {
	    			continue;
	    		}
	    		sum += i;
	    		i++;
	    	}
	    	
	    }
	    System.out.println(sum);
	    System.out.println("=========================");
	/// bài 8
	    int number = sc.nextInt();
//	    for(int i = 1; i < number +1; i++) {
//	    	if(number % i ==0) {
//	    		System.out.println("ước của " + number+ " là \t:" + i);
//	    	}
//	    }
	    System.out.println("=====================");
	    int y =1;
	    int UC = number;
	    while(y <= number) {
	    	if(number % UC == 0) {
	    		System.out.println("ước của " + number+ " là \t:" + UC);
	    	}
	    		UC--;
	    }
}
//public int sum(int a, int b) {
//	int sums = a + b;
//	return sums;
//}

}
