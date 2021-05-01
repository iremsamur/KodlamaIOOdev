
public class User {

	private int userId;
	private String adi;
	private String soyadi;
	private String mailAdres;
	private String parola;
	public User() {
		
	}
	
	public User(int userId, String adi, String soyadi, String mailAdres,String parola) {
		super();
		this.userId = userId;
		this.adi = adi;
		this.soyadi = soyadi;
		this.mailAdres = mailAdres;
		this.parola=parola;
	}

	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getAdi() {
		return adi;
	}
	public void setAdi(String firstName) {
		this.adi = firstName;
	}
	public String getSoyadi() {
		return soyadi;
	}
	public void setSoyadi(String lastName) {
		this.soyadi = lastName;
	}
	public String getMailAdres() {
		return mailAdres;
	}
	public void setMailAdres(String mailAdres) {
		this.mailAdres = mailAdres;
	}

	public String getParola() {
		return parola;
	}

	public void setParola(String parola) {
		this.parola = parola;
	}
	
	
	
}
