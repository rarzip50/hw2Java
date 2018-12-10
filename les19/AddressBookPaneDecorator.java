
public class AddressBookPaneDecorator extends TripletonAddressBookPane{
	private TripletonAddressBookPane primary; 
	
	public AddressBookPaneDecorator(TripletonAddressBookPane primary){
		this.primary = primary;
	}
	
}
