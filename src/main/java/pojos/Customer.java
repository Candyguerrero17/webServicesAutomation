package pojos;

import com.github.javafaker.Faker;
import com.github.javafaker.Name;

public class Customer {

	Faker data = new Faker();

	public String name;
	public String lastName;
	public int accountNumber;
	public String amount;
	public String transactionType;
	public String email;
	public boolean active;
	public String country;
	public int telephone;

	public Customer() {
		this.name = data.name().firstName();
		this.lastName = data.name().lastName();
		this.accountNumber = data.number().randomDigit();
		this.amount = "Abril";
		this.transactionType = "Saving";
		this.email = data.internet().emailAddress();
		this.active = true;
		this.country= data.address().country();
		this.telephone= data.number().randomDigit();
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
