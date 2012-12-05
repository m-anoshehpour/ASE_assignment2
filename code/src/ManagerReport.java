import java.util.ArrayList;

public class ManagerReport extends Report {

	public ManagerReport(final String aReportTitle, final String aReportContent) {
		super(aReportTitle, aReportContent);
		// TODO Auto-generated constructor stub
	}

	public void viewBugByState(bugModel.BugState aState) {

	}

	public void viewAllUsers() {

		// fetch lists of all user types[Manager,Engineer,Client]
		ArrayList<Client> aClientList = DataStorage.getClientList();
		ArrayList<Manager> aManagerList = DataStorage.getManagerList();
		ArrayList<Engineer> aEngineerList = DataStorage.getEngineerList();

		System.out.println("List all users\n");

		// Loop through elements and print User ID, Name and Role
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

}
