package com.pennywise.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="usertable")
public class User {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name = "accid")
	private int accid;
	
	@Column(name = "accusername")
	private String accusername;

	@Column(name = "accpassword")
	private String accpassword;
	
	@Column(name = "accfullname")
	private String accfullname;
	
//	@ManyToOne
//	@JoinColumn
//	private BankAccount bankAccount;

	public User() {
		super();
		// TODO Auto-generated constructor stub
	}

	public User(int accid, String accusername, String accpassword, String accfullname) {
		super();
		this.accid = accid;
		this.accusername = accusername;
		this.accpassword = accpassword;
		this.accfullname = accfullname;
	}

	public int getAccid() {
		return accid;
	}

	public void setAccid(int accid) {
		this.accid = accid;
	}

	public String getAccusername() {
		return accusername;
	}

	public void setAccusername(String accusername) {
		this.accusername = accusername;
	}

	public String getaccpassword() {
		return accpassword;
	}

	public void setaccpassword(String accpassword) {
		this.accpassword = accpassword;
	}

	public String getAccfullname() {
		return accfullname;
	}

	public void setAccfullname(String accfullname) {
		this.accfullname = accfullname;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((accpassword == null) ? 0 : accpassword.hashCode());
		result = prime * result + ((accfullname == null) ? 0 : accfullname.hashCode());
		result = prime * result + accid;
		result = prime * result + ((accusername == null) ? 0 : accusername.hashCode());
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
		if (accpassword == null) {
			if (other.accpassword != null)
				return false;
		} else if (!accpassword.equals(other.accpassword))
			return false;
		if (accfullname == null) {
			if (other.accfullname != null)
				return false;
		} else if (!accfullname.equals(other.accfullname))
			return false;
		if (accid != other.accid)
			return false;
		if (accusername == null) {
			if (other.accusername != null)
				return false;
		} else if (!accusername.equals(other.accusername))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "User [accid=" + accid + ", accusername=" + accusername + ", accpassword=" + accpassword
				+ ", accfullname=" + accfullname + "]";
	}

	
	
	
	
}
