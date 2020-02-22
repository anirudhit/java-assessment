/*
 * Class helping JVM understand delete employee operation by DeleteEmployeeMarker.
 */
package interfaces.markerimpl;

public class DeleteEmployeeFunc {
	
	static void isEmployeeDeleatable(Object o) {
		if(o instanceof DeleteEmployeeMarker) {
			System.out.println("Permissions available to delete an employee.");
		}else {
			System.out.println("Not enough permissoions to delete an employee.");
		}
	}
	
	public static void main(String[] args) {
		
		DeleteEmployeeImpl deleteEmployee = new DeleteEmployeeImpl();
		isEmployeeDeleatable(deleteEmployee);
		
	}

}
