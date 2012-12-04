public class Manager extends User {

	public Manager(final String aName, final String aUserID,
			final String aPassword, final UserRole aRole) {
		super(aName, aUserID, aPassword, aRole);
		// TODO Auto-generated constructor stub
		super.setRole(UserRole.MANAGER);
	}

	public void addUser(final String aName, final String aUserID,
			final String aPassword, final UserRole aRole) {

	}

	public void deleteUser(final String aUserID) {

	}

	public void addProduct(final String aProductID, final String aProductName) {

	}

	public void deleteProductID(final String aProductID) {

	}

	// TODO report generators
	public void viewAllOpenBugs() {
		System.out.println("Current Open Bugs");
	}

	public void viewBugByClientName(final String aClientName) {
		System.out.println("Open Bugs Reported By " + aClientName);
	}

	public void viewBugByProductName(final String aProductName) {
		System.out.println("Open Bugs For " + aProductName);
	}

	// TODO bug assignment
	public void assignBugToEngineer(final int aBugID, final String aEngineerID) {

	}

}
