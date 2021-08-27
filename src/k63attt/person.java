package k63attt;

import java.util.Calendar;
public class person {
	public String name;
	public int birthday;
	public String address;
	
	// setter
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setBirthday(int birthday) {
		this.birthday = birthday;
	}
	
	public void setAddress(String address) {
		this.address = address;
	}
	
	// getter
	
	public String getName() 	{
		return this.name;
	}
	
	public int getBirthday() 	{
		return this.birthday;
	}
	
	public String getAddress() 	{
		return this.address;
	}
	
	public int getAge() 		{
		Calendar calender = Calendar.getInstance();
		return (calender.get(Calendar.YEAR) - this.birthday);
	}
	
	public void showinfo() {
		System.out.println("name \t\t:" + getName());
		System.out.println("birthday \t:" + getBirthday());
		System.out.println("address \t:" + getAddress());
		System.out.println("Age \t\t:" + getAge());
	}
	
}
