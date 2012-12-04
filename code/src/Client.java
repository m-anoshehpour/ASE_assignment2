public class Client extends User {

	public Client(String aName, String aUserID, String aPassword, UserRole aRole) {
		super(aName, aUserID, aPassword, aRole);
		// TODO Auto-generated constructor stub
		super.setRole(UserRole.CLIENT);
	}

	public void reportBug(final int bugID, final String productID,
			final String bugDetails) {
	}
}
