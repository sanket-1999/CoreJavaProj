package com.exception;

class InsufficientBalanceException extends Exception {
	private String message;
	int bal;

	public InsufficientBalanceException() {
		this.message = "";
	}

	public InsufficientBalanceException(String message) {
		this.message = message;
	}

	public String toString() {
		return "\t Insufficient Balance to withdraw" + message;
	}
}

public class UserdefException {
	public void withdraw(int bal) throws InsufficientBalanceException {

		if (bal > 1000)
			throw new InsufficientBalanceException(" Insufficient balance :" + bal);

		else {
			System.out.println("Thank you for withdrawing");
		}
	}

	public static void main(String[] args) {
		UserdefException x = new UserdefException();
		try {
			x.withdraw(10000);
		}

		catch (InsufficientBalanceException e) {
			e.printStackTrace();
		}
	}
}