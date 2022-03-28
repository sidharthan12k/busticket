package user;

public interface UserInterface {

	
	public boolean UpdateUser();
	public boolean DeleteUser();
	public boolean NewUser(String userName, String gender, String age, int mobile, String uniqueId, String passHint);
}
