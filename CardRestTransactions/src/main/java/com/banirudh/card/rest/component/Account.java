package com.banirudh.card.rest.component;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table(name = "account")
public class Account {
	@Id
	@Column(name = "id")
	private int id;
	@Column(name = "accountnumber")
	private String accountNumber;
	@Column(name = "accounttype")
	private String accountType;
	@Column(name = "user_id")
	private int userId;
	@Transient
	private int count;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}
	public String getAccountType() {
		return accountType;
	}
	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	
	@Override
	public String toString() {
		return "Account [id=" + id + ", accountNumber=" + accountNumber + ", accountType=" + accountType + ", userId="
				+ userId + ", count=" + count + "]";
	}
	
}
