package k63attt;

public class student extends person {
	
	public double score;
	
	// setter
	public void setScore(double score) {
		this.score = score;
	}
	public static int count =0;
	public void counter() {
		count++;
	}
	
	// getter
	
	public double getScore() {
		return this.score;
	}
	
	public void showinfo() {
		super.showinfo();
		System.out.println("score \t\t:" + getScore());
	}
}
