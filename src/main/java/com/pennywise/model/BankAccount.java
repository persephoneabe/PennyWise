package com.pennywise.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name= "BankAccount")
public class BankAccount {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column
	int bankId;
	
	@Column
    String bankUsername;
	
	@Column
    double bankBalance;
	
	@Column
    double bankPreviousBalance;

	public BankAccount() {
		super();
		// TODO Auto-generated constructor stub
	}

	public BankAccount(int bankId, String bankUsername, double bankBalance, double bankPreviousBalance) {
		super();
		this.bankId = bankId;
		this.bankUsername = bankUsername;
		this.bankBalance = bankBalance;
		this.bankPreviousBalance = bankPreviousBalance;
	}

	public int getBankId() {
		return bankId;
	}

	public void setBankId(int bankId) {
		this.bankId = bankId;
	}

	public String getBankUsername() {
		return bankUsername;
	}

	public void setBankUsername(String bankUsername) {
		this.bankUsername = bankUsername;
	}

	public double getBankBalance() {
		return bankBalance;
	}

	public void setBankBalance(double bankBalance) {
		this.bankBalance = bankBalance;
	}

	public double getBankPreviousBalance() {
		return bankPreviousBalance;
	}

	public void setBankPreviousBalance(double bankPreviousBalance) {
		this.bankPreviousBalance = bankPreviousBalance;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(bankBalance);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + bankId;
		temp = Double.doubleToLongBits(bankPreviousBalance);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((bankUsername == null) ? 0 : bankUsername.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		BankAccount other = (BankAccount) obj;
		if (Double.doubleToLongBits(bankBalance) != Double.doubleToLongBits(other.bankBalance))
			return false;
		if (bankId != other.bankId)
			return false;
		if (Double.doubleToLongBits(bankPreviousBalance) != Double.doubleToLongBits(other.bankPreviousBalance))
			return false;
		if (bankUsername == null) {
			if (other.bankUsername != null)
				return false;
		} else if (!bankUsername.equals(other.bankUsername))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "BankAccount [bankId=" + bankId + ", bankUsername=" + bankUsername + ", bankBalance=" + bankBalance
				+ ", bankPreviousBalance=" + bankPreviousBalance + "]";
	}
	
	
	
	
}
	