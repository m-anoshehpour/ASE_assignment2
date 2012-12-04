import java.util.ArrayList;

public class DataStorage {

	
	//  lists of all maintainable data
	ArrayList<Client> clientList;
	ArrayList<Manager> managerList;
	ArrayList<Engineer> engineerList;
	ArrayList<Product> productList;
	ArrayList<bugModel> bugList;

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
	
	//Remove methods 
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

	
	//Getters to access list objects 
	public ArrayList<Client> getClientList() {
		return clientList;
	}

	public ArrayList<Manager> getManagerList() {
		return managerList;
	}

	public ArrayList<Engineer> getEngineerList() {
		return engineerList;
	}

	public ArrayList<Product> getProductList() {
		return productList;
	}

	public ArrayList<bugModel> getBugList() {
		return bugList;
	}

}
