package k63attt;

public class teacher extends person{
	
	public double salary;
		
	// setter
	
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	//getter
	
	public double getSalary() {
		return this.salary;
	}
	
	public void showinfo() {
		super.showinfo();
		System.out.println("salary \t\t:" + getSalary());
	}
}
