package com.pennywise.model;

import java.math.BigDecimal;

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
    BigDecimal bankBalance;
	
	@Column
    BigDecimal bankPreviousBalance;

	public BankAccount() {
		super();
		// TODO Auto-generated constructor stub
	}

	public BankAccount(int bankId, String bankUsername, BigDecimal bankBalance, BigDecimal bankPreviousBalance) {
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

	public BigDecimal getBankBalance() {
		return bankBalance;
	}

	public void setBankBalance(BigDecimal bankBalance) {
		this.bankBalance = bankBalance;
	}

	public BigDecimal getBankPreviousBalance() {
		return bankPreviousBalance;
	}

	public void setBankPreviousBalance(BigDecimal bankPreviousBalance) {
		this.bankPreviousBalance = bankPreviousBalance;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((bankBalance == null) ? 0 : bankBalance.hashCode());
		result = prime * result + bankId;
		result = prime * result + ((bankPreviousBalance == null) ? 0 : bankPreviousBalance.hashCode());
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
		if (bankBalance == null) {
			if (other.bankBalance != null)
				return false;
		} else if (!bankBalance.equals(other.bankBalance))
			return false;
		if (bankId != other.bankId)
			return false;
		if (bankPreviousBalance == null) {
			if (other.bankPreviousBalance != null)
				return false;
		} else if (!bankPreviousBalance.equals(other.bankPreviousBalance))
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
