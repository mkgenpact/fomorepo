package com.fomosystem.model;

public class FoModel {
	
	private String counterParty;
	private String currency;
	private String amount;
	private String buySell;
	private String tradeDate;
	private String tradeID;
	private String status;
	private String systemname;
	
	
	public String getSystemname() {
		return systemname;
	}
	public void setSystemname(String systemname) {
		this.systemname = systemname;
	}
	public String getCounterParty() {
		return counterParty;
	}
	public void setCounterParty(String counterParty) {
		this.counterParty = counterParty;
	}
	public String getCurrency() {
		return currency;
	}
	public void setCurrency(String currency) {
		this.currency = currency;
	}
	public String getAmount() {
		return amount;
	}
	public void setAmount(String amount) {
		this.amount = amount;
	}
	public String getBuySell() {
		return buySell;
	}
	public void setBuySell(String buySell) {
		this.buySell = buySell;
	}
	public String getTradeDate() {
		return tradeDate;
	}
	public void setTradeDate(String tradeDate) {
		this.tradeDate = tradeDate;
	}
	public String getTradeID() {
		return tradeID;
	}
	public void setTradeID(String tradeID) {
		this.tradeID = tradeID;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

}
