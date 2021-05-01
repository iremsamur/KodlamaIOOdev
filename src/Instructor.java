
public class Instructor extends User {
	private String verdigiDersAdi;
	private String kayitliOgrenciAdi;
	public Instructor() {
		
	}
	public Instructor(String verdigiDersAdi, String kayitliOgrenciAdi) {
		super();
		this.verdigiDersAdi = verdigiDersAdi;
		this.kayitliOgrenciAdi = kayitliOgrenciAdi;
	}
	public String getVerdigiDersAdi() {
		return verdigiDersAdi;
	}
	public void setVerdigiDersAdi(String verdigiDersAdi) {
		this.verdigiDersAdi = verdigiDersAdi;
	}
	public String getKayitliOgrenciAdi() {
		return kayitliOgrenciAdi;
	}
	public void setKayitliOgrenciAdi(String kayitliOgrenciAdi) {
		this.kayitliOgrenciAdi = kayitliOgrenciAdi;
	}
	
	

}
