package com.fomosystem.model;

public class MoModel {
	
	private String counterParty;
	private String currency;
	private String amount;
	private String buySell;
	private String tradeDate;
	private String tradeID;
	private String status;
	private String fees;
	private String mtmValue; 
	private String exchange;
	private String price;
	private String settlementDate;
	
	
	public String getFees() {
		return fees;
	}
	public void setFees(String fees) {
		this.fees = fees;
	}
	public String getMtmValue() {
		return mtmValue;
	}
	public void setMtmValue(String mtmValue) {
		this.mtmValue = mtmValue;
	}
	public String getExchange() {
		return exchange;
	}
	public void setExchange(String exchange) {
		this.exchange = exchange;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	public String getSettlementDate() {
		return settlementDate;
	}
	public void setSettlementDate(String settlementDate) {
		this.settlementDate = settlementDate;
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
