package com.banirudh.card.rest.component;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

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
	public int getUser_id() {
		return userId;
	}
	public void setUser_id(int userId) {
		this.userId = userId;
	}
	
	
	@Override
	public String toString() {
		return "Account [id=" + id + ", accountNumber=" + accountNumber + ", accountType=" + accountType + ", userId="
				+ userId + "]";
	}
}
