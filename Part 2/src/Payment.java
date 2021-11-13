/*Sherry Hayes
 *Project Part 2
 *Computer Science II - CS234 */


public class Payment extends Expense {
	private String payDate;
	
/*
Constructor receives parameters and initializes bud
@param Name. payment name/description.
@param Value. amount of payment  
@param Date. date payment submitted
*/	
	public Payment (String Name, int Value, String Date) {
		super (Name, Value);
		payDate = Date;
	}
	
	public String toString () {
		return super.toString() +"	Paid on: " +payDate;
	}	
}	

