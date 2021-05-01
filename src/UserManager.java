
public class UserManager {

	
	public void add(User user) {
		System.out.println(user.getAdi()+" isimli kullan�c� sisteme eklendi.");
	}
	public void delete(User user) {
		System.out.println(user.getAdi()+" isimli kullan�c� sistemden silindi");
	}
	public void addMultiple(User[] users) {
		for (User user : users) {
			add(user);
		}
	}
	public void deleteMultiple(User[] users) {
		for (User user : users) {
			delete(user);
		}
	}
}
