/*Sherry Hayes
 *Project Part 2
 *Computer Science II - CS234 */


public class Expense {
	private String eName;
	private int eValue;

/*
Constructor receives parameters and initializes bud
@param Name. expense name/description.
@param Value. amount of expense  
*/	
	public Expense (String Name, int Value) {
		eName = Name;
		eValue = Value;
	}
	
	public String getName () {
		return eName;
	}
	
	public int getValue () {
		return eValue;
	}
	
	public String toString () {
		return eName +"	$" +eValue;
	}
	
}
