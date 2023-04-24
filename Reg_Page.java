package g11;

import java.util.Scanner;

public class Reg_Page 
{
	private String user_Name,email;
	private int user_age,mobile_no,id;
	private float password;  
	
	Scanner sc = new Scanner(System.in);

	public Reg_Page(String user_Name, String email, int user_age, int mobile_no, int id, float password, Scanner sc)
	{
		this.user_Name = user_Name;
		this.email = email;
		this.user_age = user_age;
		this.mobile_no = mobile_no;
		this.id = id;
		this.password = password;
		this.sc = sc;
	}

	public String getUser_Name() {
		return user_Name;
	}

	public void setUser_Name(String user_Name) {
		this.user_Name = user_Name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getUser_age() {
		return user_age;
	}

	public void setUser_age(int user_age) {
		this.user_age = user_age;
	}

	public int getMobile_no() {
		return mobile_no;
	}

	public void setMobile_no(int mobile_no) {
		this.mobile_no = mobile_no;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public float getPassword() {
		return password;
	}

	public void setPassword(float password) {
		this.password = password;
	}

	public Scanner getSc() {
		return sc;
	}

	public void setSc(Scanner sc) {
		this.sc = sc;
	}
	
}
