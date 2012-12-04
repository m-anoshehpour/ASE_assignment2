
public class Engineer extends User {

	public Engineer(String aName, String aUserID, String aPassword,
			UserRole aRole) {
		super(aName, aUserID, aPassword, aRole);
		// TODO Auto-generated constructor stub
		super.setRole(UserRole.ENGINEER);
	}
	
	

}
