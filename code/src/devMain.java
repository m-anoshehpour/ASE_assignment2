

public class devMain {

	public static void main(String[] args) {
		Manager aMan = new Manager("Mohammad", "id200", "pass",
				User.UserRole.MANAGER);

		// Only one instance required to maintain all data
		final DataStorage store = new DataStorage();
		// These need to be replaced in main with Scanner or other forms of IO
		aMan.addUser("Tom", "id100", "tompass", User.UserRole.MANAGER, store);
		aMan.addUser("Bob", "id101", "bobpass", User.UserRole.MANAGER, store);
		aMan.addUser("Rob", "id500", "ribpass", User.UserRole.ENGINEER, store);
		aMan.addUser("Tim", "id400", "timpass", User.UserRole.CLIENT, store);

		aMan.viewAllUsers();
		
		aMan.deleteUser("id400", User.UserRole.CLIENT, store);
		aMan.deleteUser("id101", User.UserRole.MANAGER, store);
		aMan.deleteUser("id500", User.UserRole.ENGINEER, store);
		
		aMan.viewAllUsers();
	}
}
