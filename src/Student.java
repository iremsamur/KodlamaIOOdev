
public class Student extends User{
	private String kayitliOlduguDersAdi;
	private String egitmenAdi;
	public Student() {
		
	}
	
	public Student(String kayitliOlduguDersAdi, String egitmenAdi) {
		super();
		this.kayitliOlduguDersAdi = kayitliOlduguDersAdi;
		this.egitmenAdi = egitmenAdi;
	}

	public String getKayitliOlduguDersAdi() {
		return kayitliOlduguDersAdi;
	}
	public void setKayitliOlduguDersAdi(String kayitliOlduguDersAdi) {
		this.kayitliOlduguDersAdi = kayitliOlduguDersAdi;
	}
	public String getEgitmenAdi() {
		return egitmenAdi;
	}
	public void setEgitmenAdi(String egitmenAdi) {
		this.egitmenAdi = egitmenAdi;
	}
	

}
