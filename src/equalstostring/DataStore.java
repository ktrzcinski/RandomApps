package equalstostring;

public class DataStore {
	public static final int MAX_NOTEBOOKS = 100;
	
	private Computer notebooks[];
	private int notebooksNumber;
	
	public Computer[] getNotebooks() {
		Computer[] comps = new Computer[notebooksNumber];
		for (int i = 0; i < notebooksNumber; i++) {
			comps[i] = notebooks[i];
		}
		return comps;
	}
	
	public void setNotebooks(Computer[] notebooks) {
		this.notebooks = notebooks;
	}
	
	public int getNotebooksNumber() {
		return notebooksNumber;
	}
	
	public void setNotebooksNumber(int notebooksNumber) {
		this.notebooksNumber = notebooksNumber;
	}
	
	public DataStore() {
		notebooks = new Computer[MAX_NOTEBOOKS];
		notebooksNumber = 0;
	}
	
	public void add(Computer comp) {
		if (notebooksNumber < MAX_NOTEBOOKS) {
			notebooks[notebooksNumber] = comp;
			notebooksNumber++;
		}
	}
	
	public int checkAvailability(Computer comp) {
		if (comp == null) {
			return 0;
		}
		int number = 0;
		for (int i = 0; i < notebooksNumber; i++) {
			if (comp.equals(notebooks[i])) {
				number++;
			}
		}
		return number;
	}
}
