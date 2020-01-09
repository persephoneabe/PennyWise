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
@Table(name="usertable")
public class User {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column
	private int accId;
	
	@Column
	private String accUsername;

	@Column
	private String accPassword;
	
	@Column
	private String accFullname;
	
	@ManyToOne
	@JoinColumn
	private BankAccount bankAccount;

	public User() {
		super();
		// TODO Auto-generated constructor stub
	}

	public User(int accId, String accUsername, String accPassword, String accFullname, BankAccount bankAccount) {
		super();
		this.accId = accId;
		this.accUsername = accUsername;
		this.accPassword = accPassword;
		this.accFullname = accFullname;
		this.bankAccount = bankAccount;
	}

	public int getAccId() {
		return accId;
	}

	public void setAccId(int accId) {
		this.accId = accId;
	}

	public String getAccUsername() {
		return accUsername;
	}

	public void setAccUsername(String accUsername) {
		this.accUsername = accUsername;
	}

	public String getAccPassword() {
		return accPassword;
	}

	public void setAccPassword(String accPassword) {
		this.accPassword = accPassword;
	}

	public String getAccFullname() {
		return accFullname;
	}

	public void setAccFullname(String accFullname) {
		this.accFullname = accFullname;
	}

	public BankAccount getBankAccount() {
		return bankAccount;
	}

	public void setBankAccount(BankAccount bankAccount) {
		this.bankAccount = bankAccount;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((accFullname == null) ? 0 : accFullname.hashCode());
		result = prime * result + accId;
		result = prime * result + ((accPassword == null) ? 0 : accPassword.hashCode());
		result = prime * result + ((accUsername == null) ? 0 : accUsername.hashCode());
		result = prime * result + ((bankAccount == null) ? 0 : bankAccount.hashCode());
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
		User other = (User) obj;
		if (accFullname == null) {
			if (other.accFullname != null)
				return false;
		} else if (!accFullname.equals(other.accFullname))
			return false;
		if (accId != other.accId)
			return false;
		if (accPassword == null) {
			if (other.accPassword != null)
				return false;
		} else if (!accPassword.equals(other.accPassword))
			return false;
		if (accUsername == null) {
			if (other.accUsername != null)
				return false;
		} else if (!accUsername.equals(other.accUsername))
			return false;
		if (bankAccount == null) {
			if (other.bankAccount != null)
				return false;
		} else if (!bankAccount.equals(other.bankAccount))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "User [accId=" + accId + ", accUsername=" + accUsername + ", accPassword=" + accPassword
				+ ", accFullname=" + accFullname + ", bankAccount=" + bankAccount + "]";
	}

	
	
	
}
