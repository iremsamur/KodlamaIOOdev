
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Instructor egitmen1= new Instructor();
		Student ogrenci1 = new Student();
		egitmen1.setAdi("Engin ");
		egitmen1.setVerdigiDersAdi("Java ile programlama");
		ogrenci1.setAdi("�rem");
		ogrenci1.setKayitliOlduguDersAdi("Java ile programlama");
		Instructor egitmen2= new Instructor();
		Student ogrenci2 = new Student();
		egitmen2.setAdi("Ayd�n ");
		egitmen2.setVerdigiDersAdi("C# ile programlama");
		ogrenci2.setAdi("Cengiz");
		ogrenci2.setKayitliOlduguDersAdi("C# ile programlama");
		User[] user = {ogrenci1,ogrenci2,egitmen1,egitmen2};
		UserManager manager = new UserManager();
		manager.addMultiple(user);
		System.out.println(ogrenci1.getAdi()+" isimli ��renci "+egitmen1.getAdi()+" isimli e�itmenin"+ogrenci1.getKayitliOlduguDersAdi()+" adl� dersine kaydolmu�tur");
		User[] user2 = {ogrenci2,egitmen2};
		manager.deleteMultiple(user2);
		InstructorManager instructorManager = new InstructorManager();
		instructorManager.add(egitmen1,"Python Programlama");
		StudentManager studentManager = new StudentManager();
		studentManager.yeniDerseKaydol(ogrenci1,"Python Programlama");
		
		
		

	}

}
