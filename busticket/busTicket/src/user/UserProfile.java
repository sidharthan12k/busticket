package user;

public class UserProfile implements UserInterface{
	private String userName = null;
	private String  gender = null;
	private String age = null;
	private String uniqueId = null;
	private int mobile;
	private String password = null;
	private String passHint = null;
	private int passHashCode ;
	public String getUserName() {
		return(userName);
	}public String getGender() {
		return(userName);
	}public String getAge() {
		return(userName);
	}public String getUniqueID() {
		return(userName);
	}public String getMobile() {
		return(userName);
	}
	
	@Override
	public boolean NewUser(String userName, String gender, String age, int mobile, String uniqueId, String passHint) {
		// TODO Auto-generated method stub
		try {
			this.userName = userName;
			this.gender= gender;
			this.age=age;
			this.mobile=mobile;
			this.uniqueId=uniqueId;
			this.passHint=passHint;
			HashCodeGen(password, passHint);
			
			}
			catch(Exception e) {
				System.out.print("user registration failed\nEnter valid details");
				return false;
			}
			return true;
		
	}
	
	private void HashCodeGen(String password,String passHint) {
		this.passHashCode = (password+passHint).hashCode();
		this.password = password;
		//return true;
	}
	public boolean updatePassword(String password,String passHint) {
		if(PassHashValidate(passHint)) {
			this.password = password;
			return true;
		}else {
			return false;
		}
	}
	private boolean PassHashValidate(String passHint) {
		if(password+passHint.hashCode() == this.passHashCode+""){
			return true;
		}else {
			return false;
		}
	}

	@Override
	public boolean UpdateUser() {
		// TODO Auto-generated method stub
		return false;
	}
	public boolean UpdateUser(int num) {
		return false;
	}

	@Override
	public boolean DeleteUser() {
		// TODO Auto-generated method stub
		this.userName = null;
		this.gender= null;
		this.age=null;
		this.mobile=0;
		this.uniqueId=null;
		this.passHint=null;
		this.password=null;
		return false;
	}
	
	

}
