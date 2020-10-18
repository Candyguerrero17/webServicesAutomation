package pojos;

import com.github.javafaker.Name;
/**
 * Class get and set to Customer.
 * 
 * @author 
 *
 */
public class Customer {

	public String name;
	public String lastName;
	public int accountNumber;
	public String amount;
	public String transactionType;
	public String email;
	public boolean active;
	public String country;
	public int telephone;

	public Customer(String name,String lastName, int accountNumber,String amount, String transactionType, String email,
			boolean active,String country,int telephone) {
		this.name = name;
		this.lastName = lastName;
		this.accountNumber = accountNumber;
		this.amount = amount;
		this.transactionType = transactionType;
		this.email = email;
		this.active = active;
		this.country= country;
		this.telephone= telephone;
		
	}




	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getAmount() {
		return amount;
	}

	public void setAmount(String amount) {
		this.amount = amount;
	}

	public String getTransactionType() {
		return transactionType;
	}

	public void setTransactionType(String transactionType) {
		this.transactionType = transactionType;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public boolean isActive() {
		return active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public int getTelephone() {
		return telephone;
	}

	public void setTelephone(int telephone) {
		this.telephone = telephone;
	}

	public void setLastName(Name name2) {
		// TODO Auto-generated method stub

	}
}
