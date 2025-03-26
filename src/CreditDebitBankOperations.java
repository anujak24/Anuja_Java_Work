//Create a class called Bank, which should 3 methods.
//Consider your initial balance is 1000 rs.
//1. creditAmt : which should increase balance by 300 rs
//2. debitAmt : which should deduct balance by 500 rs
//3. display : which should print current balance. 
//
//from main method, calling sequence should be,
//creditAmt();
//debitAmt();
//creditAmt();
//display;

//output : Your current balance is 1100.*/
public class CreditDebitBankOperations {
	int initialBal = 1000;
	int debitBal = 500 ;
	int creditBal = 300;
	int currentBal = initialBal;
	

	public static void main(String[] args) {
		CreditDebitBankOperations creditDebitBankOperations = new CreditDebitBankOperations();
		creditDebitBankOperations.creditAmt();
		creditDebitBankOperations.debitAmt();
		creditDebitBankOperations.creditAmt();
		creditDebitBankOperations.displayCurrentBal();

	}

	private void displayCurrentBal() {
		System.out.println("My current balance is: "+currentBal);
	}

	private void debitAmt() {
		currentBal = currentBal - debitBal;
	}

	private void creditAmt() {
		currentBal = currentBal + creditBal;
	}

}