public class BookPaneSingleton {
	private static int numberOfActivePanes = 0;
	final static int NUMBER_OF_OBJECTS = 3;
	
	public static AddressBookPane getInstance() {
		if (numberOfActivePanes > NUMBER_OF_OBJECTS)
			return null;
		else {
			numberOfActivePanes++;
			return new AddressBookPane();
		}
	}
}
