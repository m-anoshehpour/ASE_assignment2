public class User {

	private String name;
	private String userID;
	private String password;
	private UserRole role;

	public User(final String aName, final String aUserID,
			final String aPassword, final UserRole aRole) {
		this.setName(aName);
		this.setUserID(aUserID);
		this.setPassword(aPassword);
		this.setRole(aRole);
	}

	public enum UserRole {
		MANAGER, CLIENT, ENGINEER
	};

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getUserID() {
		return userID;
	}

	public void setUserID(String userID) {
		this.userID = userID;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public UserRole getRole() {
		return role;
	}

	public void setRole(final UserRole aRole) {
		this.role = aRole;
	}

}
