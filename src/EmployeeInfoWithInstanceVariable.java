//Create a class called EmployeeDetails having following instance variable.
//firstName, lastName, empId (int), managerId (int), address (String), phoneNumber(String) ["+91-9765463742"]
//
//create 5 methods.
//1) updatePrimaryInfo() -> firstName, lastName, empId, managerId
//2) updateSecondaryInfo() -> address, phoneNumber
//3) displayPrimaryInfo() -> firstName, lastName, empId, managerId
//4) displayOtherInfo() -> address, phoneNumber
//5) displayAllInfo() -> firstName, lastName, empId, managerId, address, phoneNumber
//
//main -> updatePrimaryInfo() -> updateSecondaryInfo() -> displayPrimaryInfo() -> displayOtherInfo() -> displayAllInfo()
public class EmployeeInfoWithInstanceVariable {

	public static void main(String[] args) {
		EmployeeInfoWithInstanceVariable employeeInfoWithInstanceVariable = new EmployeeInfoWithInstanceVariable();
		employeeInfoWithInstanceVariable.updatePrimaryInfo();
		employeeInfoWithInstanceVariable.updateSecondaryInfo();
		employeeInfoWithInstanceVariable.displayPrimaryInfo();
		employeeInfoWithInstanceVariable.displayOtherInfo();
		employeeInfoWithInstanceVariable.displayAllInfo();

	}

	String firstName;
	String lastName;
	int empId;
	int managerId;
	String address;
	String phoneNumber;

	private void displayAllInfo() {
		System.out.println("My all info is");
		displayPrimaryInfo();
		displayOtherInfo();

	}

	private void displayOtherInfo() {
		System.out.println("My secondory info is ");
		System.out.println(address + " " + phoneNumber);
	}

	private void displayPrimaryInfo() {
		System.out.println("My primary info is ");
		System.out.println(firstName + " " + lastName + " " + empId + " " + managerId);
	}

	private void updateSecondaryInfo() {
		address = "Viman nagar Pune";
		phoneNumber = "+91 95525775343";

	}

	private void updatePrimaryInfo() {
		firstName = "Anuja";
		lastName = "Kannawar";
		empId = 187;
		managerId = 98;
	}

}
