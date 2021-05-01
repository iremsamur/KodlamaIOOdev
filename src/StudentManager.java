
public class StudentManager extends UserManager{
	
	public void yeniDerseKaydol(Student student,String yeniKurs) {
		System.out.println(student.getAdi()+" isimli öğrenci "+yeniKurs+" isimli derse kaydoldu ");
	}

}
