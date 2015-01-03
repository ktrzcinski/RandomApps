package equalstostring;

public class NotebookShop {
	public static void main(String[] args) {
		DataStore dataStore = new DataStore();
		dataStore.add(new Computer("ASUS",12345));
		dataStore.add(new Computer("ASUS",12345));
		dataStore.add(new Computer("APPLE",5));
		dataStore.add(new Computer("APPLE",6));
		dataStore.add(new Computer("HP",34534));
		
		Computer compToFind = new Computer("ASUS",12345);
		int computersFound = dataStore.checkAvailability(compToFind);
		System.out.println("Numbers of notebooks found (" + compToFind + ") is: " + computersFound);
		System.out.println("All available notebooks:");
		for (Computer c: dataStore.getNotebooks()) {
			System.out.println(c);
		}
	}
}
