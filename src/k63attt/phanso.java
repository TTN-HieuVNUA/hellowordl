package k63attt;

import java.util.Iterator;

public class phanso {
	
	public int tuso ;
	public int mauso ;

	
	
	/// CONSTRUCTOR
	public phanso(int Tuso, int Mauso) {
		this.tuso = Tuso;
		this.mauso = Mauso;
	}
	
	public phanso() {
		
	}
	// setter
	public void setTuso(int tuso) {
		this.tuso = tuso;
	}
	
	public void setMauso(int mauso) {
		this.mauso = mauso;
	}
	
	public String print() {
		return this.getTuso() + "/" + this.getMauso();
	}
	
	// getter
	
	public int getTuso() {
		return this.tuso;
	}
	public int getMauso() {
		return this.mauso;
	}
	
	public void getPrint() {
		System.out.print("phan so la \t:" + this.print() +"\n");
	}
	// kiểm tra UCLN
	public static int UCLN(int a, int b) {
		int result = Math.min(a, b);
		
		while(result >=1) {
			if(a % result == 0 && b % result == 0)
				return result;
			result --;
		}
		
		return result;
	}
	
	/// KTRA phân số tối giản
	
	public boolean checktoigian() {
		if(this.UCLN(this.getTuso(), this.getMauso()) == 1)
		{return true;}
		return false;
	}
	
	// phân số tối giản
	public void toigian() {
		int UCLN = this.UCLN(this.getTuso(), this.getMauso());
		this.tuso = this.getTuso() / UCLN;
		this.mauso = this.getMauso() / UCLN;
	}
	
	
	
}
