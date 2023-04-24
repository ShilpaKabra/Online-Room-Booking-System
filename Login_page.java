package g11;

public class Login_page 
{
	private int id;
	private float password;
	
	public Login_page(int id, float password) 
	{
		this.id = id;
		this.password = password;
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
	
}
