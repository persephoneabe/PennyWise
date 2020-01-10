package com.pennywise.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name= "bankaccount")
public class BankAccount {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name = "bankid")
	int bankid;
	
	@Column(name = "bankusername")
    String bankusername;
	
	@Column(name = "bankbalance")
    double bankbalance;
	
	@Column(name = "bankpreviousbalance")
    double bankpreviousbalance;
	
	@ManyToOne
	@JoinColumn(name = "accid")
	private User user;

	public BankAccount() {
		super();
		// TODO Auto-generated constructor stub
	}

	public BankAccount(int bankid, String bankusername, double bankbalance, double bankpreviousbalance, User user) {
		super();
		this.bankid = bankid;
		this.bankusername = bankusername;
		this.bankbalance = bankbalance;
		this.bankpreviousbalance = bankpreviousbalance;
		this.user = user;
	}

	public int getBankid() {
		return bankid;
	}

	public void setBankid(int bankid) {
		this.bankid = bankid;
	}

	public String getBankusername() {
		return bankusername;
	}

	public void setBankusername(String bankusername) {
		this.bankusername = bankusername;
	}

	public double getBankbalance() {
		return bankbalance;
	}

	public void setBankbalance(double bankbalance) {
		this.bankbalance = bankbalance;
	}

	public double getBankpreviousbalance() {
		return bankpreviousbalance;
	}

	public void setBankpreviousbalance(double bankpreviousbalance) {
		this.bankpreviousbalance = bankpreviousbalance;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(bankbalance);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + bankid;
		temp = Double.doubleToLongBits(bankpreviousbalance);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((bankusername == null) ? 0 : bankusername.hashCode());
		result = prime * result + ((user == null) ? 0 : user.hashCode());
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
		if (Double.doubleToLongBits(bankbalance) != Double.doubleToLongBits(other.bankbalance))
			return false;
		if (bankid != other.bankid)
			return false;
		if (Double.doubleToLongBits(bankpreviousbalance) != Double.doubleToLongBits(other.bankpreviousbalance))
			return false;
		if (bankusername == null) {
			if (other.bankusername != null)
				return false;
		} else if (!bankusername.equals(other.bankusername))
			return false;
		if (user == null) {
			if (other.user != null)
				return false;
		} else if (!user.equals(other.user))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "BankAccount [bankid=" + bankid + ", bankusername=" + bankusername + ", bankbalance=" + bankbalance
				+ ", bankpreviousbalance=" + bankpreviousbalance + ", user=" + user + "]";
	}

	
	
}
	