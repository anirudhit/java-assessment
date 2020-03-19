package com.banirudh.card.rest.component;

public class Dashboard {
	
	private int accountCount;
	private int transactionHistoryCount;
	private int userCount;
	
	public int getAccountCount() {
		return accountCount;
	}
	public void setAccountCount(int accountCount) {
		this.accountCount = accountCount;
	}
	public int getTransactionHistoryCount() {
		return transactionHistoryCount;
	}
	public void setTransactionHistoryCount(int transactionHistoryCount) {
		this.transactionHistoryCount = transactionHistoryCount;
	}
	public int getUserCount() {
		return userCount;
	}
	public void setUserCount(int userCount) {
		this.userCount = userCount;
	}
	
	
	@Override
	public String toString() {
		return "Dashboard [accountCount=" + accountCount + ", transactionHistoryCount=" + transactionHistoryCount
				+ ", userCount=" + userCount + "]";
	}
}
