import java.util.ArrayList;
import java.util.Iterator;

public class Manager extends User {

	public Manager(final String aName, final String aUserID,
			final String aPassword, final UserRole aRole) {
		super(aName, aUserID, aPassword, aRole);
		// TODO Auto-generated constructor stub
		super.setRole(UserRole.MANAGER);
	}

	public void addUser(final String aName, final String aUserID,
			final String aPassword, final UserRole aRole, DataStorage storage) {

		switch (aRole) {

		case CLIENT:

			Client newClient = new Client(aName, aUserID, aPassword, aRole);
			DataStorage.getClientList().add(newClient);
			System.out.println("Client " + aName + " was added successfully");
			break;

		case ENGINEER:

			Engineer newEngineer = new Engineer(aName, aUserID, aPassword,
					aRole);
			DataStorage.getEngineerList().add(newEngineer);
			System.out.println("Engineer " + aName + " was added successfully");

			break;
		case MANAGER:

			Manager newManager = new Manager(aName, aUserID, aPassword, aRole);

			DataStorage.getManagerList().add(newManager);
			System.out.println("Manager " + aName + " was added successfully");
			break;

		default:
			System.out.println("Unbale to create user, unknown role: " + aRole);
			break;
		}

	}

	public void deleteUser(final String aUserID, final UserRole aRole,
			DataStorage storage) {

		switch (aRole) {

		case CLIENT:

			ArrayList<Client> aClientList = DataStorage.getClientList();

			for (Iterator<Client> clientIter = aClientList.iterator(); clientIter
					.hasNext();) {
				Client aClient = clientIter.next();
				if (aClient.getUserID().equals(aUserID)) {
					clientIter.remove();
					System.out.println("Client ID " + aUserID
							+ " was deleted successfully");
				}
			}
			break;

		case ENGINEER:

			ArrayList<Engineer> aEngineerList = DataStorage.getEngineerList();

			for (Iterator<Engineer> engineerIter = aEngineerList.iterator(); engineerIter
					.hasNext();) {
				Engineer aEngineer = engineerIter.next();
				if (aEngineer.getUserID().equals(aUserID)) {
					engineerIter.remove();
					System.out.println("Engineer ID " + aUserID
							+ " was deleted successfully");
				}
			}
			break;

		case MANAGER:

			ArrayList<Manager> aManagerList = DataStorage.getManagerList();

			for (Iterator<Manager> managerIter = aManagerList.iterator(); managerIter
					.hasNext();) {
				Manager aManager = managerIter.next();
				if (aManager.getUserID().equals(aUserID)) {
					managerIter.remove();
					System.out.println("Manager ID " + aUserID
							+ " was deleted successfully");
				}
			}
			break;

		default:
			System.out.println("Unbale to delete user, unknown role: " + aRole);
			break;

		}

	}

	public void addProduct(final String aProductID, final String aProductName) {

	}

	public void deleteProductID(final String aProductID) {

	}

	// TODO report generators
	public void viewAllUsers() {
		ArrayList<Client> aClientList = DataStorage.getClientList();
		ArrayList<Manager> aManagerList = DataStorage.getManagerList();
		ArrayList<Engineer> aEngineerList = DataStorage.getEngineerList();

		System.out.println("List all users\n");

		for (Client client : aClientList) {
			System.out.println("User ID: " + client.getUserID() + ", Name: "
					+ client.getName() + ", Role: " + client.getRole());
		}

		for (Manager man : aManagerList) {
			System.out.println("User ID: " + man.getUserID() + ", Name: "
					+ man.getName() + ", Role: " + man.getRole());
		}

		for (Engineer eng : aEngineerList) {
			System.out.println("User ID: " + eng.getUserID() + ", Name: "
					+ eng.getName() + ", Role: " + eng.getRole());
		}

	}

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
