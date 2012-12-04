import java.util.ArrayList;

public class DataStorage {

	// lists of all maintainable data
	private static ArrayList<Client> clientList;
	private static ArrayList<Manager> managerList;
	private static ArrayList<Engineer> engineerList;
	private static ArrayList<Product> productList;
	private static ArrayList<bugModel> bugList;

	public DataStorage() {
		clientList = new ArrayList<Client>();
		managerList = new ArrayList<Manager>();
		engineerList = new ArrayList<Engineer>();
		productList = new ArrayList<Product>();
		bugList = new ArrayList<bugModel>();
	}

	public void addClient(final Client aClient) {
		clientList.add(aClient);
	}

	public void addManger(final Manager aManager) {
		managerList.add(aManager);
	}

	public void addEngineer(final Engineer aEngineer) {
		engineerList.add(aEngineer);
	}

	public void addProduct(final Product aProduct) {
		productList.add(aProduct);
	}

	public void addBug(final bugModel aBug) {
		bugList.add(aBug);
	}

	// Remove methods
	public void removeClient(final Client aClient) {
		clientList.remove(aClient);
	}

	public void removeManger(final Manager aManager) {
		managerList.remove(aManager);
	}

	public void removeEngineer(final Engineer aEngineer) {
		engineerList.remove(aEngineer);
	}

	public void removeProduct(final Product aProduct) {
		productList.add(aProduct);
	}

	public void removeBug(final bugModel aBug) {
		bugList.add(aBug);
	}

	public static void setClientList(ArrayList<Client> clientList) {
		DataStorage.clientList = clientList;
	}

	public static void setManagerList(ArrayList<Manager> managerList) {
		DataStorage.managerList = managerList;
	}

	public static void setEngineerList(ArrayList<Engineer> engineerList) {
		DataStorage.engineerList = engineerList;
	}

	public static void setProductList(ArrayList<Product> productList) {
		DataStorage.productList = productList;
	}

	public static void setBugList(ArrayList<bugModel> bugList) {
		DataStorage.bugList = bugList;
	}

	public static ArrayList<Client> getClientList() {
		return clientList;
	}

	public static ArrayList<Manager> getManagerList() {
		return managerList;
	}

	public static ArrayList<Engineer> getEngineerList() {
		return engineerList;
	}

	public static ArrayList<Product> getProductList() {
		return productList;
	}

	public static ArrayList<bugModel> getBugList() {
		return bugList;
	}

}
